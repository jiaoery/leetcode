package leetcode92;

/**
 * @ClassName: Solution9202.java
 * @Description:指针算法
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年12月23日 下午5:28:53 
 */
public class Solution9202 {
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
	
	public static void main(String[] args) {
		Solution9202 solution9201 = new Solution9202();
		String version1 = "1.01",version2 = "1.001";
		System.out.println("Version:"+solution9201.compareVersion(version1, version2));
		
		String version3 = "1",version4 = "1.0.0";
		System.out.println("Version:"+solution9201.compareVersion(version3, version4));
		
		String version5 = "0.1",version6 = "1.1";
		System.out.println("Version:"+solution9201.compareVersion(version5, version6));
		
		String version7 = "1.0.1", version8 = "1";
		System.out.println("Version:"+solution9201.compareVersion(version7, version8));
		
		String version9 = "7.5.2.4", version10 = "7.5.3";
		System.out.println("Version:"+solution9201.compareVersion(version9, version10));
		
		String version11 = "11", version12 = "10";
		System.out.println("Version:"+solution9201.compareVersion(version11, version12));
	}
}
