package leetcode58;


/**
 * @ClassName: Solution5801.java
 * @Description:����
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��11��4�� ����2:03:43 
 */
public class Solution5801 {
	public static int countSegments(String s) {
		String trim = s.trim();
        if(trim.equals("")){
            return 0; 
        }
        //ʹ������ƥ��\s ����ո�
        String[] words = trim.split("\\s+");
        return words.length;
    }
	
  public static void main(String[] args) {
	System.out.println("words:"+countSegments("                "));
}
}
