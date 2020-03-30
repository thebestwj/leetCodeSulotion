package com.wj.leetcode.contest.W182;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by white_wolf on 2020/3/29.
 *
 * @author thebestwj
 */
class UndergroundSystem { //AC

   Map<Integer,Record> in = new HashMap<>();
   Map<String, ArrayList<Integer>> time = new HashMap<>();

    public UndergroundSystem() {

    }

    public void checkIn(int id, String stationName, int t) {
        in.put(id,new Record(stationName,t));
    }

    public void checkOut(int id, String stationName, int t) {
         Record record = in.get(id);
         String key = record.station + ":*" + stationName;
         if (time.containsKey(key)){
             ArrayList<Integer> timelist = time.get(key);
             timelist.add(t-record.t);
             time.put(key,timelist);
         }else{
             ArrayList<Integer> timelist = new ArrayList<>();
             timelist.add(t-record.t);
             time.put(key,timelist);
         }

    }

    public double getAverageTime(String startStation, String endStation) {
        String key = startStation + ":*" + endStation;
        ArrayList<Integer> timelist = time.get(key);
        long l = 0;
        for(int i: timelist) {
            l+=i;
        }
        double b = timelist.size();
        double res = l/b;   //integer division in floating-point context
        return res;
    }
}

class Record{
    String station;
    int t;
    Record (String station,int t){
        this.station = station;
        this.t = t;
    };
}