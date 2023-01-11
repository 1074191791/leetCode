package com.zhou.offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author zhous
 * @version 1.0
 * @date 2022/6/13 15:14
 */
public class MinStack {

    List<Integer> list;

    /** initialize your data structure here. */
    public MinStack() {
        list = new ArrayList<>();
    }

    public void push(int x) {
        list.add(x);
    }

    public void pop() {
        int i = list.size();
        if(i == 0) {
            return ;
        }
        list.remove(i - 1);
    }

    /**
     * 栈顶？
     * @return
     */
    public int top() {
        int i = list.size();
        if(i == 0) {
            return -1;
        }
        return list.get(i - 1);
    }

    public int min() {
        return list.stream().min(Integer::compareTo).get();
    }


    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-1);
        System.out.println(obj.min());
        System.out.println(obj.top());
        obj.pop();
        System.out.println(obj.min());
    }

}
