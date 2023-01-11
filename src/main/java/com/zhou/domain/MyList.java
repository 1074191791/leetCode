package com.zhou.domain;

import java.util.List;
import java.util.Random;

/**
 * @author zhous
 * @version 1.0
 * @date 2021/3/11 11:08
 */
public class MyList {

    private List list;

    public MyList(List list) {
        this.list = list;
    }

    public synchronized void add(Integer i) {
        try {
            Thread.sleep(new Random().nextInt(50));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.list.add(i);
    }

    //public void sout() {
    //    JSONUtil.toJsonPrettyStr(list);
    //}

}
