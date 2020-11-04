package leetcode58;


/**
 * @ClassName: Solution5801.java
 * @Description:正则
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年11月4日 下午2:03:43 
 */
public class Solution5801 {
	public static int countSegments(String s) {
		String trim = s.trim();
        if(trim.equals("")){
            return 0; 
        }
        //使用正则匹配\s 代表空格
        String[] words = trim.split("\\s+");
        return words.length;
    }
	
  public static void main(String[] args) {
	System.out.println("words:"+countSegments("                "));
}
}
