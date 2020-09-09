package leetcode34;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Solution3401.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年9月9日 上午10:38:59
 */
public class Solution3401 {
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> resultList = new ArrayList<List<Integer>>();
		int[][] arrays = new int[numRows][numRows];
		// 行数据
		for (int i = 0; i < numRows; i++) {
		     List<Integer> subList = new ArrayList<Integer>();
		     for(int j=0;j<=i;j++) {
		    	 //对角线和第一列元素均为1
		    	 if(j==0||i==j) {
		    		 arrays[i][j]=1;
		    	 }else {
					arrays[i][j]=arrays[i-1][j-1]+arrays[i-1][j];
				}
		    	 subList.add(arrays[i][j]);
		     }
		     resultList.add(subList);
		}
		
		return resultList;
		
	}
	
	public static void main(String[] args) {
		List<List<Integer>> reList = generate(5);
		System.out.println(reList);
	}
}
