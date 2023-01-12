package com.zhou.demo;

import java.util.Arrays;

/**
 * @author zhous
 * @version 1.0
 * @date 2023/1/12 15:02
 */
public class Demo704 {

    // nums有序， target目标值， 返回下标，没有返回 -1
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int mid = nums.length/2;
        while(true) {
            if(target > nums[mid]) {
                // 目标值在 右侧
                left = mid;
                mid = left+(right-left)/2;
                if(mid == left) {
                    return -1;
                }
            } else if (target < nums[mid]) {
                //目标值在 左侧
                right = mid;
                mid = left+(right-left)/2;
                if(mid == right) {
                    return -1;
                }
            } else {
                //== 命中
                return mid;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int[] sorted = Arrays.stream(arr).sorted().toArray();
        System.out.println(search(sorted, 111));


    }


}
