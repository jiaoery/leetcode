package leetcode166;

/**
 * ClassName: Solution165<br/>
 * Description: TODO Description. <br/>
 * date: 2022/3/29 10:45<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution16601 {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        while(start<=end){
            int middle = start + (end-start)/2;
            long sqrt  = (long)middle*(long)middle;
            if(sqrt<x){
                start = middle+1;
            }else if(sqrt>x){
                end = middle-1;
            }else{
                return middle;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        Solution16601 solution = new Solution16601();
        System.out.println(solution.mySqrt(2147483647));
    }
}
