package leetcode53;


/**
 * @ClassName: Solution5302.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��10��21�� ����10:26:11 
 */
public class Solution5302 {
	
	public static boolean detectCapitalUse(String word) {
		// ^ ��ʼ���� + ǰ��ı��ʽ�����һ�λ��� $������ʾ�� | ƽ������������������or����˼  [a-z]Сд [A-Z]��д
		String pattern = "^[A-Z]+$|^[a-z]+$|^[A-Z][a-z]+$";
		return word.matches(pattern);
    }
	
	public static void main(String[] args) {
		System.out.println("test1: USA , reuslt "+ detectCapitalUse("USA"));
		System.out.println("test2: FlaG , reuslt "+ detectCapitalUse("FlaG"));
		System.out.println("test3: Google , reuslt "+ detectCapitalUse("Google"));
	}

}
