package leetcode07;

/**
 * @ClassName: Solution07.java
 * @Description:除数博弈论：推导法
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年7月24日 下午1:14:06 
 */
public class Solution0701 {
	 public boolean divisorGame(int N) {
		 if(N<0||N>1000){
	            throw new RuntimeException("nums out of limit");
	        }
	        return N % 2 == 0;
	    }
}
