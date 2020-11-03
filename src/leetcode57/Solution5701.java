package leetcode57;

/**
 * @ClassName: Solution5701.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年11月3日 下午3:38:12 
 */
public class Solution5701 {
	public static boolean validMountainArray(int[] A) {
		//先提条件判断
		if(A==null||A.length<3) {
			return false;
		}
		//标记
		int mark ;
		//上山
		for (mark = 1; mark < A.length&&A[mark-1]<A[mark]; mark++);
		//若一次爬到头或一次都爬不动
		if(mark==1||mark == A.length) {
			return false;
		}
		
		
		//下山
		for (; mark < A.length&&A[mark-1]>A[mark]; mark++) ;
	
		//判断是否达到山底
		return mark == A.length;
    }
	
	public static void main(String[] args) {
		int[] nums = {0,3,2,1};
		System.out.println("validMountainArray:"+validMountainArray(nums));
	}
}
