package leetcode97;

/**
 * @ClassName: Solution9601.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2021年1月7日 上午10:34:59 
 */
public class Solution9701 {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		//允许加种数量
		int allow = 0;
		int count =1;
	
		for (int index = 0; index < flowerbed.length; index++) {
			if(flowerbed[index]==0) {
				count++;
			}else{
                count = 0;
            }
			//连续三次为0，可种一次花
			if(count==3) {
				allow++;
				count=1;
			}
		}
		//最后位置是否可以钟花
		if(count==2) {
			allow++;
		}
		return allow>=n;
    }
	
	public static void main(String[] args) {
		Solution9701 solution = new Solution9701();
		int[] flowerbed1 = {1,0,0,0,1};
		int n1 = 1;
		System.out.println(solution.canPlaceFlowers(flowerbed1, n1));
		
		int[] flowerbed2 = {};
		int n2 = 1;
		System.out.println(solution.canPlaceFlowers(flowerbed2, n2));
		
		int[] flowerbed3 = {0};
		int n3 = 1;
		System.out.println(solution.canPlaceFlowers(flowerbed3, n3));
		
		int[] flowerbed4 = {0,0};
		int n4 = 2;
		System.out.println(solution.canPlaceFlowers(flowerbed4, n4));
	}
}
