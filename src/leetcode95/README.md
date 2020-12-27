#  解题思路

## 1.1 代码

```java
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
```

## 1.2复杂度分析

* 时间复杂度：
* 空间复杂度：