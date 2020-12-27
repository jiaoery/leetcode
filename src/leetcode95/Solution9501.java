package leetcode95;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName: Solution9501.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年12月25日 上午10:03:40 
 */
public class Solution9501 {

	public String findLongestWord(String s, List<String> d) {
		String result = "";
		Collections.sort(d,new Comparator<String>() {
            @Override
            public int compare(String o1,String o2) {
                int len1=o1.length(),len2=o2.length();
                if(len1==len2) {
                    return o1.compareTo(o2);
                }
                return len1-len2;
            }
        });
		for (int i = 0; i < d.size(); i++) {
			String index = d.get(i);
			//符合包含原理
			if(isSubsequence(index, s)&&(index.length()>result.length())) {
				result = index;
			}
		}
		return result;
    }
	
	
	public boolean isSubsequence(String s, String t) {
		char[] s1 = s.toCharArray();
		 char[] t1 = t.toCharArray();
		 int ps = 0;
		 int pt = 0;
		 //两个字符都未到尾部
		 while (pt<t1.length&&ps<s1.length) {
			if(s1[ps]==t1[pt]) {
				ps++;
			}
			pt++;		
		}
		 return ps==s1.length;
	 }
	
	public static void main(String[] args) {
		Solution9501 solution =  new Solution9501();
		
		List<String> list1 = new ArrayList<String>();
		list1.add("ale");
		list1.add("apple");
		list1.add("monkey");
		list1.add("plea");
		String s1 = "abpcplea";
		System.out.println("Result:"+solution.findLongestWord(s1, list1));
		
		
		List<String> list2 = new ArrayList<String>();
		list2.add("a");
		list2.add("b");
		list2.add("c");
		String s2 = "abpcplea";
		System.out.println("Result:"+solution.findLongestWord(s2, list2));
		
		List<String> list3 = new ArrayList<String>();
		list3.add("apple");
		list3.add("ewaf");
		list3.add("awefawfwaf");
		list3.add("aewfa");
		list3.add("ewafeffewafewf");
		String s3 = "aewfafwafjlwajflwajflwafj";
		System.out.println("Result:"+solution.findLongestWord(s3, list3));
	}
}
