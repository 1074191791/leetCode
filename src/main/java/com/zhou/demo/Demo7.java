package com.zhou.demo;

/**
 * @author zhous
 * @version 1.0
 * @date 2023/1/11 14:05
 */
public class Demo7 {

    public static void main(String[] args) {
        System.out.println(reverse(-147483648));
    }

    // 用String反序
    //tips: 要考虑超出存储长度的问题，


    public static int reverse(int x) {
        String a = String.valueOf(x);
        int flag = 1;
        if (x < 0) {
            flag = -1;
            a = a.substring(1);
        }
        try {
            return Integer.valueOf((new StringBuilder(a)).reverse().toString()) * flag;
        }catch (Exception e){
            return 0;
        }
    }



}
