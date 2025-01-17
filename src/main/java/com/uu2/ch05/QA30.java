package com.uu2.ch05;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class QA30 {
    /**
     * 插入、删除和随机访问都是O（1）的容器
     */
    HashMap<Integer, Integer> numToLocation = new HashMap<>();
    ArrayList<Integer> nums = new ArrayList<>();

    public Boolean insert(int val){
        if(numToLocation.containsKey(val)) {
            return true;
        }
        numToLocation.put(val, nums.size());
        nums.add(val);
        return true;
    }

    public Boolean remove(int val) {
        if(!numToLocation.containsKey(val)) {
            return false;
        }

        int location = numToLocation.get(val);
        int lastVal = nums.get(nums.size() - 1);
        numToLocation.put(lastVal, location);
        numToLocation.remove(val);
        nums.set(location, lastVal);
        nums.remove(nums.size() - 1);
        return true;
    }

    public int getRandom() {
        return nums.get((int)(Math.random() * nums.size()));
    }

}
