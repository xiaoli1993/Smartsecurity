package com.nuowei.smartsecurity.util;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    /**
     * 检测邮箱格式
     *
     * @param email
     * @return
     */
    public static boolean isEmial(String email) {
        String str = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";
        Pattern pattern = Pattern.compile(str, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}
