package com.zhou.daily;

/**
 * @author zhous
 * @version 1.0
 * @date 2022/11/8 19:23
 */
public class BubbleTestDemo {


    public static void main(String[] args) {
        int[] arr = {4, 6, 15, 2, 9, 8};
        // 方式1
        //typeOne(arr);

        // 优化1

        //quickSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }


    public static void typeOne(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }












}
