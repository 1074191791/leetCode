package com.zhou.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhous
 * @version 1.0
 * @date 2022/6/13 13:47
 */
public class CQueue {

    List<Integer> list ;

    public CQueue() {
        list = new ArrayList();
    }

    public void appendTail(int value) {
        list.add(value);
    }

    public int deleteHead() {
        if(list.isEmpty()) {
            return -1;
        }
        return list.remove(0);
    }


    /**
     * Your CQueue object will be instantiated and called as such:
     * CQueue obj = new CQueue();
     * obj.appendTail(value);
     * int param_2 = obj.deleteHead();
     */
    public static void main(String[] args) {
        CQueue obj = new CQueue();
        System.out.println(obj.deleteHead());
        obj.appendTail(5);
        obj.appendTail(2);
        System.out.println(obj.deleteHead());
        System.out.println(obj.deleteHead());
    }



    public Node copyRandomList(Node head) {
        Node res = head;
        return res;
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
