package leetcode159;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution15901 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<Integer, List<String>> map = new HashMap<>();
        //存入map
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
               if(list1[i].equals(list2[j])){
                   if(!map.containsKey(i+j)){
                       map.put(i+j,new ArrayList<>());
                   }
                   map.get(i+j).add(list1[i]);
               }
            }
        }
        int minIndex  = Integer.MAX_VALUE;
        for(int index:map.keySet()){
            minIndex = Math.min(minIndex,index);
        }
        return map.get(minIndex).toArray(new String[map.get(minIndex).size()]);
    }
}
