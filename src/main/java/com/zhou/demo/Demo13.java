package com.zhou.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhous
 * @version 1.0
 * @date 2023/1/11 16:29
 */
public class Demo13 {


    //字符串法
    public int romanToInt(String s) {
        return useMeth(s);
    }

    public int useMeth(String s) {
        int res = 0;

        char[] chars = s.toCharArray();
        int idx = chars.length-1;
        for (int i = 0; i < idx; i++) {
           res += getValue(chars[i]) * (getValue(chars[i]) < getValue(chars[i+1])? -1:1);
        }
        res += getValue(chars[idx]);
        return res;
    }




    public int useStr(String s) {
        int res = 0;
        s = s.replace("IV", "a"); // 4
        s = s.replace("IX", "b"); // 9
        s = s.replace("XL", "c"); //40
        s = s.replace("XC", "d"); //90
        s = s.replace("CD", "e"); //400
        s = s.replace("CM", "f"); //900

        Map<Character, Integer> tmp = new HashMap<>();
        tmp.put('a', 4);
        tmp.put('b', 9);
        tmp.put('c', 40);
        tmp.put('d', 90);
        tmp.put('e', 400);
        tmp.put('f', 900);
        tmp.put('I', 1);
        tmp.put('V', 5);
        tmp.put('X', 10);
        tmp.put('L', 50);
        tmp.put('C', 100);
        tmp.put('D', 500);
        tmp.put('M', 1000);

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            res += tmp.get(chars[i]);
        }
        return res;
    }


    public int getValue(char c) {
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            //case 'a': return 4;
            //case 'b': return 9;
            //case 'c': return 40;
            //case 'd': return 90;
            //case 'e': return 400;
            //case 'f': return 900;
        }
        return 0;
    }


}
