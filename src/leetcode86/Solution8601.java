package leetcode86;

import java.util.Arrays;

/**
 * @ClassName: Solution8601.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年12月18日 下午3:34:16 
 */
public class Solution8601 {
	public int compress(char[] chars) {
		//anchor 指向连续的位置
		int anchor = 0,write = 0;
		for (int read = 0; read < chars.length; read++) {
			// 1.超域 2.前一个数据和后一个数据不相同 
			if(read+1==chars.length
					||chars[read+1]!=chars[read]) {
				//首先记录重复字符
				chars[write++] = chars[anchor];
				//需要压缩的个数超过所需表达
				if(read>anchor) {
					for (char c : ("" + (read - anchor + 1)).toCharArray() ) {
						chars[write++] = c;
					}
				}
				//当前位前进一位
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
