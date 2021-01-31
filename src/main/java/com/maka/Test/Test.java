package com.maka.Test;

import com.maka.utils.MD5;

import java.security.NoSuchAlgorithmException;

public class Test {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String s="123456";
        System.out.println(MD5.getMD5(s).toString());

    }
}
