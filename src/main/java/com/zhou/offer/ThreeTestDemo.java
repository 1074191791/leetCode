package com.zhou.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhous
 * @version 1.0
 * @date 2022/6/20 9:49
 */
public class ThreeTestDemo {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    /*public int[] levelOrder(TreeNode root) {
        if(root == null) {
            return new int[0];
        }
        List<Integer> res = new ArrayList<Integer>();
        List<TreeNode> list = new ArrayList<>();
        list.add(root);

        while (!list.isEmpty()) {
            TreeNode remove = list.remove(0);
            res.add(remove.val);
            if (remove.left != null) {
                list.add(remove.left);
            }
            if (remove.right != null) {
                list.add(remove.right);
            }
        }
        int[] rr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            rr[i] = res.get(i);
        }
        return rr;
    }*/

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        int count = 2 >> 1;

        while(!list.isEmpty()) {
            TreeNode remove = list.remove(0);

        }


        return res;



    }
}
