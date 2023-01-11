package com.zhou.offer;

import cn.hutool.core.collection.CollectionUtil;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author zhous
 * @version 1.0
 * @date 2023/1/5 9:40
 */
public class MinLengthTest {

    public static void main(String[] args) {
        Integer arr[] = {2};
        //[1, 2, 2, 3, 3, 4, 3, 1, 1]，频率最高的有数字 1 和 3 ，但是 3 构成的数组 [3, 3, 4, 3] 长度 （ 4 ）最小，所以输出 4 。

        Map<Integer, TmpLog> countMap = new HashMap();

        for (int i = 0; i < arr.length; i++) {
            TmpLog tmpLog = countMap.get(arr[i]);
            if (tmpLog == null) {
                TmpLog log = new TmpLog();
                log.setCount(1);
                log.setFirstIdx(i);
                log.setLastIdx(i);
                countMap.put(arr[i], log);
                continue;
            }
            tmpLog.setCount(tmpLog.getCount() + 1);
            tmpLog.setLastIdx(i);
            countMap.put(arr[i], tmpLog);
        }


        LinkedHashMap<Integer, TmpLog> lkHashMap = CollectionUtil.sortByEntry(countMap, (o1, o2) -> o2.getValue().getCount() - o1.getValue().getCount());
        System.out.println(lkHashMap);

        Integer maxCount = 0;
        Integer minLength = 0;
        for (Map.Entry<Integer, TmpLog> tmpEntry : lkHashMap.entrySet()) {
            TmpLog value = tmpEntry.getValue();
            if (maxCount < value.getCount()) {
                maxCount = value.getCount();
            }
            if (maxCount.equals(value.getCount())) {
                //System.out.println(value);
                minLength = value.getLastIdx() - value.getFirstIdx() + 1;
            } else {
                break;
            }
        }
        System.out.println(minLength);
    }

    static class TmpLog {
        public TmpLog() {
        }

        Integer firstIdx;
        Integer lastIdx;
        Integer count;

        public Integer getFirstIdx() {
            return firstIdx;
        }

        public void setFirstIdx(Integer firstIdx) {
            this.firstIdx = firstIdx;
        }

        public Integer getLastIdx() {
            return lastIdx;
        }

        public void setLastIdx(Integer lastIdx) {
            this.lastIdx = lastIdx;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        @Override
        public String toString() {
            return "TmpLog{" +
                    "firstIdx=" + firstIdx +
                    ", lastIdx=" + lastIdx +
                    ", count=" + count +
                    '}';
        }
    }


}
