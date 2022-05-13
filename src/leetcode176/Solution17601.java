package leetcode176;

/**
 * ClassName: leetcode176.Solution176<br/>
 * Description: TODO Description. <br/>
 * date: 2022/5/13 10:45<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution17601 {
    public boolean oneEditAway(String first, String second) {
        int length1 = first.length();
        int length2 = second.length();
        int distance = length1-length2;
        if(distance>1||distance<-1){
            return false;
        }
        //仅能使用一次
        int count =1;
        int index1 = 0;
        int index2 = 0;
        while(index1<length1&&index2<length2){
            if(first.charAt(index1)!=second.charAt(index2)){
                if (distance==1){//first 长度更长,跳过一位
                    index1++;
                    count--;
                }else if(distance==-1){//second 长度更长，跳过一位
                    index2++;
                    count--;
                }else {//位数相同，后移一位
                    count--;
                    index1++;
                    index2++;
                }
                if(count<0){//机会使用完了
                    return false;
                }
            }else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution17601 solution = new Solution17601();
        String first = "ors";
        String second = "hors";
        System.out.println(solution.oneEditAway(first,second));
    }
}
