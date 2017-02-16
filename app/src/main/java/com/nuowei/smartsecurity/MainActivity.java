package com.nuowei.smartsecurity;/**
 * Created by hp on 2016/12/12.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.kymjs.rxvolley.RxVolley;
import com.kymjs.rxvolley.client.HttpCallback;
import com.kymjs.rxvolley.client.HttpParams;
import com.kymjs.rxvolley.http.VolleyError;
import com.lzy.okgo.callback.StringCallback;
import com.nuowei.smartsecurity.http.OkHttpManage;
import com.nuowei.smartsecurity.util.Utils;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

import okhttp3.Call;
import okhttp3.Response;


/**
 * 作者：肖力
 * 邮箱：554674787@qq.com
 * 时间：2016/12/12 09:49
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout activityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityMain = (LinearLayout) findViewById(R.id.activity_main);
        findViewById(R.id.b_Login).setOnClickListener(this);
    }

    // url地址
    private final String url = "http://console.heiman.cn:8887";
    // 企业ID
    private final String corp_id = "1007d2ada7d4a000";
    // 获取验证码
    private final String getTokenCodeUrl = url + "/v2/user_register/verifycode";

    // 登陆
    private final String LoginUrl = url + "/v2/user_auth";

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.b_Login:
                //TODO implement
//                OkHttpManage.getInstance().doLogin("851596261@qq.com", "xiaoli", new StringCallback() {
//                    @Override
//                    public void onSuccess(String s, Call call, Response response) {
//                        MyApp.getLogger().d("参数：" + s + "response:" + response);
//                    }
//
//                    @Override
//                    public void onError(Call call, Response response, Exception e) {
//                        //错误返回
//                        MyApp.getLogger().e("参数：" + response.toString());
//                    }
//                });
//                HashMap<String, String> params = new HashMap<>();
//                params.put("email", "554674787@qq.com");
//                params.put("corp_id", corp_id);
//                params.put("password", "xiaoli.");

                HttpParams params = new HttpParams();
                JSONObject paramJson = new JSONObject();
                try {
                    paramJson.put("email", "554674787@qq.com");
                    paramJson.put("corp_id", corp_id);
                    paramJson.put("password", "xiaoli");
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                params.putJsonParams(paramJson.toString());


                new RxVolley.Builder()
                        .url(LoginUrl)
                        .httpMethod(RxVolley.Method.POST) //default GET or POST/PUT/DELETE/HEAD/OPTIONS/TRACE/PATCH
                        .cacheTime(6) //default: get 5min, post 0min
                        .contentType(RxVolley.ContentType.JSON)//default FORM or JSON
                        .params(params)
                        .shouldCache(true) //default: get true, post false
                        .callback(new HttpCallback() {
                            @Override
                            public void onSuccess(String t) {
                                MyApp.getLogger().d("参数：" + t);
                            }

                            @Override
                            public void onFailure(int errorNo, String strMsg) {
                                MyApp.getLogger().e("参数：" + "errorNo:" + errorNo);
                            }

                            @Override
                            public void onFailure(VolleyError error) {
                                MyApp.getLogger().e("参数：" + "error:" + error.getMessage());
                            }
                        })
                        .encoding("UTF-8") //default
                        .doTask();
                break;
        }
    }
}
