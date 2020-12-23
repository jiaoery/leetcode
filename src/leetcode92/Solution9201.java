package leetcode92;

/**
 * @ClassName: Solution9201.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年12月23日 下午5:08:35 
 */
public class Solution9201 {
	
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
	
	public static void main(String[] args) {
		Solution9201 solution9201 = new Solution9201();
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
	}
}
