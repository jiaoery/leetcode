package leetcode86;

import java.util.Arrays;

/**
 * @ClassName: Solution8601.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��12��18�� ����3:34:16 
 */
public class Solution8601 {
	public int compress(char[] chars) {
		//anchor ָ��������λ��
		int anchor = 0,write = 0;
		for (int read = 0; read < chars.length; read++) {
			// 1.���� 2.ǰһ�����ݺͺ�һ�����ݲ���ͬ 
			if(read+1==chars.length
					||chars[read+1]!=chars[read]) {
				//���ȼ�¼�ظ��ַ�
				chars[write++] = chars[anchor];
				//��Ҫѹ���ĸ�������������
				if(read>anchor) {
					for (char c : ("" + (read - anchor + 1)).toCharArray() ) {
						chars[write++] = c;
					}
				}
				//��ǰλǰ��һλ
				anchor = read+1;
				
			}
		}
		return write;
	}
	
	
	public static void main(String[] args) {
		Solution8601 solution8601 =  new Solution8601();
		char[] test1 = {'a','a','b','b','c','c','c'};
		System.out.println(solution8601.compress(test1));
	}
}
