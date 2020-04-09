package com.wj.leetcode.Q460;

/**
 * Created by white_wolf on 2020/4/5.
 *
 * @author thebestwj
 */
public class LFUCache {

    int[] keys;
    int[] values;
    int[] used;
    int[] time;    //全改成hashMap可以O(1)
    int ep;
    int size;
    int cp;

    public LFUCache(int capacity) {
        keys = new int[capacity];
        values = new int[capacity];
        used = new int[capacity];
        time = new int[capacity];
        size = 0;
        ep = 1;   //ep还可以重置一下
        cp = capacity;
    }

    public int get(int key) {
        if(cp==0) return -1;
        for (int i = 0; i < Math.min(keys.length,size); i++) {
            if(keys[i]==key){
                used[i]++;
                time[i] = ep;
                ep++;
                return values[i];
            }
        }
        return -1;
    }

    public void put(int key, int value) {
        if(cp==0) return;
        for (int i = 0; i < keys.length; i++) {
            if(keys[i]==key && used[i]>0){
                values[i]=value;
                used[i]++;
                time[i]=ep;
                ep++;
                return;
            }
        }

        if (size < keys.length) {
            keys[size] = key;
            values[size] = value;
            used[size] = 1;
            time[size] = ep;
            ep++;
            size++;
        }else{
            int index =LU();
            keys[index] = key;
            values[index] = value;
            used[index] = 1;
            time[index] = ep;
            ep++;
        }
    }

    private int LU() {
        int index=0;
        int minEp=Integer.MAX_VALUE;
        int minCount=Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
//            System.out.println("key"+keys[i]+"count"+used[i]+"ep"+time[i]);

            if(used[i]==minCount){
                if(time[i]<minEp) {
                    minEp = time[i];
                    index=i;
                }
            }

            if (used[i]<minCount) {
                minCount = used[i];
                minEp = time[i];
                index = i;
            }

        }
//        System.out.println(keys[index]);
        return index;
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */