package com.zhou.offer;


import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author zhous
 * @version 1.0
 * @date 2022/6/14 8:59
 */
public class Solution {


    public Node copyRandomList(Node head) {
        //把所有节点复制一遍，只复制值，用哈希表存，
        Map<Node, Node> map = new HashMap<Node, Node>();
        Node headCopy = head;
        Node headCopy2 = head;
        while (head != null) {
            Node tmp = new Node(head.val);
            map.put(head, tmp);
            head = head.next;
        }

        //然后根据以前链表的顺序把新链表连起来
        while (headCopy != null) {
            Node node = map.get(headCopy);
            node.next = map.get(headCopy.next);
            node.random = map.get(headCopy.random);
            headCopy = headCopy.next;
        }
        return map.get(headCopy2);
    }


    public static int[] reversePrint(ListNode head) {
        ListNode node = head;
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        int[] res = new int[size];
        for (int i = size - 1; i >= 0; --i) {
            res[i] = node.val;
            node = node.next;
        }
        return res;
    }


    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode node = head;
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        int[] tmp = new int[size];
        for (int i = size - 1; i >= 0; --i) {
            tmp[i] = node.val;
            node = node.next;
        }
        ListNode res = new ListNode(tmp[0]);
        ListNode head2 = res;
        for (int i = 1; i < tmp.length; i++) {
            res.next = new ListNode(tmp[i]);
            res = res.next;
        }
        return head2;
    }

    /*public static void main(String[] args) {

        *//*ListNode a = new ListNode(1);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(2);
        a.next = b;
        b.next = c;
        int[] ints = reversePrint(a);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }*//*


        //System.out.println(reverseLeftWords("abcdefg", 2));
        int[] nums = {0,1,3,4,5};
        //int target = 9;
        System.out.println(missingNumber(nums));
        ;
    }*/


    public static String replaceSpace(String s) {
        return s.replace(" ", "%20");
    }


    public static String reverseLeftWords(String s, int n) {
        String tail = s.substring(0, n);
        String head = s.substring(n);
        return head + tail;
    }


    public int findRepeatNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            Integer intVal = map.get(nums[i]);
            if (intVal == null) {
                map.put(nums[i], 0);
            } else {
                res = nums[i];
                break;
            }

        }
        return res;
    }


    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                if (nums[right] != target) {
                    right--;
                } else if (nums[left] != target) {
                    left++;
                } else {
                    break;
                }
            }
        }
        return right - left + 1;
    }


    public static int missingNumber(int[] nums) {
       int left = 0;
       int right = nums.length -1;

       while(left <= right) {
           int mid = (left + right) /2;
           if(nums[mid] != mid) {
               //已经发生偏移
               right = mid - 1;
           } else {
               left = mid + 1;
           }
       }
       return left;

    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length == 0) {
            return false;
        }
        int x = 0;
        int y = matrix[0].length -1;
        while(y >= 0 && x < matrix.length) {
            int val = matrix[x][y];
            if(val == target) {
                return true;
            } else if(val > target) {
                y--;
            } else if(val < target){
                x++;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(minArray(arr));
    }

    public static int minArray(int[] numbers) {
         //[3,4,5,1,2]
        // 中值比最右边小的时候，说明当前数据已经有序，最大值肯定在
        int left = 0;
        int right = numbers.length -1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(numbers[mid] > numbers[right]) {
                left = mid + 1;
            } else if(numbers[mid] < numbers[right]) {
                right = mid;
            } else {
                right--;
            }
        }
        return numbers[left];
    }


    public static char firstUniqChar(String s) {
        Character res = null;
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            Integer integer = map.get(chars[i]);
            if( integer == null) {
                map.put(chars[i], 0);
            } else {
                map.put(chars[i], ++integer);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if(map.get(chars[i]) == 0) {
                res = chars[i];
                break;
            }
        }
        return res == null? ' ': res;
    }




}


class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
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