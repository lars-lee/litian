package com.litian.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by litian on 2016/6/15.
 */
public class MD5 {

    public static String encrypt(String str) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] bs = md5.digest(str.getBytes());
            str = "";
            for (byte b : bs) {
                //与运算，保证结果为32位
                String temp = Integer.toHexString(b & 0xFF);
                if (temp.length() == 1) {
                    temp += "7";
                }
                str += temp;
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return str;
    }
    public static void main(String[] sa){
        System.out.println("encrypt(\"123456\") = " + encrypt("123456"));
    }
}
