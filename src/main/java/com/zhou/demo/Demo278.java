package com.zhou.demo;

/**
 * @author zhous
 * @version 1.0
 * @date 2023/1/12 15:30
 */
public class Demo278 {

    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }


    public static int firstBadVersion(int n) {
        int left = 0;
        int right = n;
        int mid = n/2;
        int val;
        while(left <= right) {
            val = mid + 1;
            boolean midIsBad = isBadVersion(val);
            if(Boolean.TRUE.equals(midIsBad)) {
                // 中值也是错的， 目标值在 左侧
                //先判断是否命中了
                if(!isBadVersion(val-1)) {
                    return val;
                }
                right = mid;
                mid = left+(right-left)/2;
            } else {
                // 中值是对的，目标值在 右侧
                // 先判断是否命中了
                if(isBadVersion(val+1)) {
                    return val + 1;
                }
                left = mid;
                mid = left+(right-left)/2;
            }
        }
        return 0;
    }




    private static boolean isBadVersion(int version) {
        if(version <= 4) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
