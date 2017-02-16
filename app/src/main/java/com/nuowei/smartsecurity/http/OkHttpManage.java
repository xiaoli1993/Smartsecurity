package com.nuowei.smartsecurity.http;/**
 * Created by hp on 2016/12/12.
 */

import com.lzy.okgo.OkGo;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.callback.AbsCallback;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.convert.StringConvert;
import com.lzy.okgo.model.HttpParams;
import com.lzy.okrx.RxAdapter;
import com.nuowei.smartsecurity.util.Utils;

import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;

import okhttp3.Call;
import okhttp3.Response;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;

/**
 * 作者：肖力
 * 邮箱：554674787@qq.com
 * 时间：2016/12/12 09:18
 */
public class OkHttpManage {
    // url地址
    private final String url = "http://console.heiman.cn:8887";
    // 企业ID
    private final String corp_id = "1007d2ada7d4a000";
    // 获取验证码
    private final String getTokenCodeUrl = url + "/v2/user_register/verifycode";

    // 登陆
    private final String LoginUrl = url + "/v2/user_auth";

    private static OkHttpManage instance;

    public static OkHttpManage getInstance() {
        if (instance == null) {
            instance = new OkHttpManage();
        }
        return instance;
    }

    public void onGetTokenCode(String user, AbsCallback callback) {
        HashMap<String, String> params = new HashMap<>();
        if (Utils.isEmial(user)) {
            params.put("email", user);
        } else {
            params.put("phone", user);
        }
        params.put("corp_id", corp_id);
        JSONObject jsonObject = new JSONObject(params);

        OkGo.post(getTokenCodeUrl)                // 请求方式和请求url
                .tag(this)                        // 请求的 tag, 主要用于取消对应的请求
                .cacheMode(CacheMode.NO_CACHE)    // 缓存模式，详细请看缓存介绍
                .upJson(jsonObject.toString())
                .execute(callback);
    }

    public void doLogin(String user, String password, AbsCallback callback) {
        HashMap<String, String> params = new HashMap<>();
        if (Utils.isEmial(user)) {
            params.put("email", user);
        } else {
            params.put("phone", user);
        }
        params.put("corp_id", corp_id);
        params.put("password", password);
        JSONObject jsonObject = new JSONObject(params);

        OkGo.post(LoginUrl)                       // 请求方式和请求url
                .tag(this)                        // 请求的 tag, 主要用于取消对应的请求
                .cacheMode(CacheMode.NO_CACHE)    // 缓存模式，详细请看缓存介绍
                .upJson(jsonObject.toString())
                .execute(callback);
    }

}
