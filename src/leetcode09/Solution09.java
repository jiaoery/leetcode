package leetcode09;

/**
 * @ClassName: Solution09.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��7��29�� ����11:18:44 
 */
public class Solution09 {
	
	 public static int reverse(int x) {
	        //2^31-1 = 2147483647,-2^31= -2147483648
	        //ʹ�ø���Χ
	        long result = 0;
	        while(x != 0){
	            result=result*10+x%10;
	            x/=10;
	            //�ж��Ƿ���
	            if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE){
	                return 0;
	            }
	        }
	        return (int) result;

	    }
	 
	 public static void main(String[] args) {
		int pre = 214748364;
		int result = reverse(pre);
		System.out.println("pre��"+pre+"result:"+result);
	}

}
