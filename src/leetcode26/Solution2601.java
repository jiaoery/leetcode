package leetcode26;

public class Solution2601 {

	public int firstMissingPositive(int[] nums) {
		int length = nums.length;
		for(int i=0;i<length;i++) {
			//循环找到对应的位置
			while(nums[i]>=1&&nums[i]<=length&&nums[nums[i]-1]!=nums[i]) {
				swap(nums,i,nums[i]-1);
			}
		}
		//遍历查找丢失数字
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=i+1) {
				return i+1;
			}
		}
		return length+1;
	}
	
	public void swap(int[] nums,int i, int j) {
		int temp = nums[i];
		nums[i]=nums[j];
		nums[j]= temp;
	}
	
	public static void main(String[] args) {
		int[] array = {1,1};
		int result = new Solution2601().firstMissingPositive(array);
		System.out.println("result:"+result);
	}
}
