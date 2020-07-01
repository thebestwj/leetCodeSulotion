package com.wj.leetcode.Q101_200.Q147;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by white_wolf on 2020/6/19.
 *
 * @author thebestwj
 */
public class LRUCache extends LinkedHashMap<Integer, Integer> {

    int capacity = 0;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}
