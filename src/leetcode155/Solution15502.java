package leetcode155;

/**
 * ClassName: Solution15502<br/>
 * Description: TODO Description. <br/>
 * date: 2022/3/1 16:31<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution15502 {
    public boolean isHappy(int n) {
       int slow = happyNum(n);
       int fast = happyNum(happyNum(n));
       while (slow!=fast){
          if(slow==1){
              return true;
          }
          //slow one step
          slow = happyNum(slow);
           //fast two step
          fast = happyNum(happyNum(fast));
       }
       return slow==1;
    }

    public int happyNum(int n){
        int temp = 0;
        while (n!=0){
            int level = n%10;
            temp += level*level;
            n/=10;
        }
        return temp;
    }

    public static void main(String[] args) {
        Solution15502 solution = new Solution15502();
        System.out.println("result:"+solution.isHappy(2));
    }
}
