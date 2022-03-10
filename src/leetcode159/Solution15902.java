package leetcode159;

import java.util.ArrayList;
import java.util.List;

public class Solution15902 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> result = new ArrayList<>();
        for(int sum = 0;sum<list1.length+ list2.length-1;sum++){
            for (int i =0;i<=sum;i++){
                if(i< list1.length&&sum-i< list2.length&& list1[i].equals(list2[sum-i])){
                    result.add(list1[i]);
                }
            }
            if(result.size()>0){
                break;
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
