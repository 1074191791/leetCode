package com.zhou.offer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * 双指针问题
 *
 * @author zhous
 * @version 1.0
 * @date 2023/1/5 10:38
 */
public class DoubleIndx {
    // 双人自行车，承重M， 公司里面共N个人， 每个人的体重都小于M， 试着求一下最少需要多少辆自行车


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int N = sc.nextInt();

        List<Integer> weightList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int tmpW = sc.nextInt();
            weightList.add(tmpW);
        }
        Collections.sort(weightList);





    }





}
