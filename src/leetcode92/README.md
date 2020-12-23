# 解题思路

# 1.使用split拆分

使用split拆分两个字符串，然后转为int进行比较![image.png](https://upload-images.jianshu.io/upload_images/2326194-e017ecc08a2163a1.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

数据结构变化如上图

### 1.1 代码

```java
public int compareVersion(String version1, String version2) {
		String[] vs1= version1.split("\\.");
		String[] vs2= version2.split("\\.");
		for (int i = 0; i < Math.max(vs1.length,vs2.length); i++) {
			int s1 = i<vs1.length?Integer.parseInt(vs1[i]):0;
			int s2 = i<vs2.length?Integer.parseInt(vs2[i]):0;
			if(s1>s2) {
				return 1;
			}else if (s1<s2) {
				return -1;
			}
		}
		return 0;
    }
```

### 1.2 复杂度分析

* O(N):N为两个字符串长度的最大值，需要遍历一次
* O(N):存储分割后字符串数组，

## 2.使用指针

除了使用现成的API，也可以使用指针来做操作，并且无需使用过高的额外空间；

* 分别使用指针p1,p2;
* p1在version1中使用，遇到.号停止取值；其他状态下，按照 ans = ans*1+当前字符-‘0’；
* p2的逻辑也如上面一样的；
* 然后逐项比较两个取值，并向后移动指针；

### 2.1 代码

```java
public int compareVersion(String version1, String version2) {
		int p1 = 0;
		int p2 = 0;
		while (p1<version1.length()||p2<version2.length()) {
			//保存对比数据变量
			int ver1 = 0,ver2 = 0;
			//取对比值
			while (p1<version1.length()&&version1.charAt(p1)!='.') {
				ver1 =ver1*10+version1.charAt(p1++)-'0';
			}
	
			while (p2<version2.length()&&version2.charAt(p2)!='.') {
				ver2 =ver2*10+version2.charAt(p2++)-'0';
			}
			if(ver1>ver2) {
				return 1;
			}else if (ver1<ver2) {
				return -1;
			}
			p1++;
			p2++;
		}
		return 0;
		
	}
```

### 2.2 复杂度分析

* 时间复杂度：O(N)。N为两个字符串长度的最大值，需要遍历一次

* 空间复杂度：O(1),进引入少数变量；（指针，比较变量）