package com.zhou.demo;

/**
 * @author zhous
 * @version 1.0
 * @date 2023/1/11 13:46
 */
public class Demo9 {


    /**
     * 是否回文数
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        Boolean flag = Boolean.TRUE;
        char[] arr = String.valueOf(x).toCharArray();
        for (int i = 0 , j = arr.length-1; i < arr.length/2; i++, j--) {
            if(arr[i] != arr[j]) {
                flag = Boolean.FALSE;
                break;
            }
        }
        return flag;
    }


    public static void main(String[] args) {
        int abc = 112;

        System.out.println(isPalindrome(abc));
    }


}
