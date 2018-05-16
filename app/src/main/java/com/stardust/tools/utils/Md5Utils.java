package com.stardust.tools.utils;

import java.security.MessageDigest;

/**
 * Created on 2018/5/16.
 *
 * @author wangchongyang
 */
public class Md5Utils {

    public static String MD5(String s) {
        char[] hexDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        try {
            byte[] input = s.getBytes();
            MessageDigest mdInstance = MessageDigest.getInstance("MD5");
            mdInstance.update(input);
            byte[] md = mdInstance.digest();
            int length = md.length;
            char[] str = new char[length * 2];
            int i = 0;

            for (byte b : md) {
                str[i++] = hexDigits[b >>> 4 & 15];
                str[i++] = hexDigits[b & 15];
            }

            return new String(str);
        } catch (Exception var10) {
            return null;
        }
    }
}
