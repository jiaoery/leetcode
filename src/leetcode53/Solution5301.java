package leetcode53;


/**
 * @ClassName: Solution5301.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��10��21�� ����10:39:07 
 */
public class Solution5301 {
	
	public static boolean detectCapitalUse(String word) {
		int highcase = 0;
		
		for (int i = 0; i < word.length(); i++) {
			//ͳ�ƴ�д����
			if(word.charAt(i)>='A'&&word.charAt(i)<='Z') {
				highcase++;
			}
		}
		//��ĸ��Ϊ��д��ΪСд
		if(highcase == word.length() || highcase ==0) {
			return true;
		}
		
		//����ĸ��д
		if(word.charAt(0)>='A'&&word.charAt(0)<='Z'&&highcase==1) {
			return true;
		}
		return false;
		
    }
	
	public static void main(String[] args) {
		System.out.println("test1: USA , reuslt "+ detectCapitalUse("USA"));
		System.out.println("test2: FlaG , reuslt "+ detectCapitalUse("FlaG"));
		System.out.println("test3: Google , reuslt "+ detectCapitalUse("Google"));
	}

}
