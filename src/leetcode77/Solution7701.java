package leetcode77;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Solution77.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��11��27�� ����10:55:43 
 */
public class Solution7701 {
	public List<String> fizzBuzz(int n) {
		List<String> result =  new ArrayList<String>();
		for (int i = 1; i <=n; i++) {
			if(i%15==0) {
				result.add("FizzBuzz");
				continue;
			}
			if(i%3==0) {
				result.add("Fizz");
				continue;
			}
			if (i%5==0) {
				result.add("Buzz");
				continue;
			}
			result.add(i+"");
		}
		return result;
    }
	
    public static void main(String[] args) {
    	Solution7701 sol = new Solution7701();
		System.out.println(sol.fizzBuzz(15));
	}
}
