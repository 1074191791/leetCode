package com.zhou.demo;

import org.junit.Test;

/**
 * @author zhous
 * @create 2019-10-28 17:32
 */
public class Demo35 {

    @Test
    public void test() {
        int[] arr = {1, 3, 5, 6};
        int i = searchInsert(arr, 2);
        System.out.println(i);
    }


    public int searchInsert(int[] nums, int target) {
        return bs(nums, target);
    }

    /**
     * 简单一层for循环
     * @param nums
     * @param target
     * @return
     */
    public int forSerach(int[] nums, int target) {
        int flag = 0;
        for(int i = 0; i < nums.length; ++i) {
            if(nums[i] < target) {
                flag++;
            } else {
                break;
            }
        }
        return  flag;
    }

    /**
     * 二分方案
     * @param nums
     * @param target
     * @return
     */
    public int bs(int[] nums, int target) {
        int length = nums.length;
        int left = 0;
        int right = length;
        int mid = right / 2;

        while(true) {
            if(target > nums[mid]) {
                // 目标值在 右侧
                left = mid;
                mid = left+(right-left)/2;
                if(mid == left) {
                    return right;
                }
            } else if (target < nums[mid]) {
                //目标值在 左侧
                right = mid;
                mid = left+(right-left)/2;
                if(mid == right) {
                    return right;
                }
            } else {
                //== 命中
                return mid;
            }
        }
    }

}
