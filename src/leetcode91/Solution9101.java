package leetcode91;

/**
 * @ClassName: Solution9101.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年12月23日 上午11:20:29
 */
public class Solution9101 {
	//个位数字
	String[] low = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
	//11~20
    String[] mid = {"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    //20-90
    String[] high = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

	public String numberToWords(int num) {
		 if(num==0){
	            return "Zero";
	        }
		 //地位数
		 int one = num%1000;
		 num /=1000;
		 //千位数
		 int thousand = num%1000;
		 num /=1000;
		 
		 //百万位
		 int million = num%1000;
		 num /=1000;
		 //十亿位
		 int billon = num%1000;
		 num /= 1000;
		 
		 StringBuilder result =  new StringBuilder();
		 
		 if(billon!=0) {
			 result.append(lowerNumer(billon)+" Billion ");
		 }
		 if(million!=0) {
			 result.append(lowerNumer(million)+" Million ");
		 }
		 if(thousand!=0) {
			 result.append(lowerNumer(thousand)+" Thousand ");
		 }
		 if(one!=0) {
			 result.append(lowerNumer(one));
		 }
		 
		 return result.toString();
	}
	
	/**
	 * 低位运算
	 * @param num 输入数字
	 * @return
	 */
	public String lowerNumer(int num) {
		int one = num%10;
		num /=10;
		int ten = num%10;
		num /=10;
		int hundred = num;
		
		StringBuilder sBuilder = new StringBuilder();
		
		if (hundred!=0) {
			sBuilder.append(low[hundred]+" Hundred ");
		}
		
		//10~19
		if(ten==1) {
			System.out.println(one);
			sBuilder.append(mid[one]);
		}else if (ten==0) {
			sBuilder.append(low[one]);
		}else {
			sBuilder.append(high[ten]+" "+low[one]);
		}
		return sBuilder.toString().trim();
	}
	
	public static void main(String[] args) {
		Solution9101 solution9101 = new Solution9101();
		int num1 = 50868;
		System.out.println("Nums :"+num1+",atter:"+solution9101.numberToWords(num1));
		
		int num2 = 1234;
		System.out.println("Nums :"+num2+",atter:"+solution9101.numberToWords(num2));
		
		int num3 = 1234567;
		System.out.println("Nums :"+num3+",atter:"+solution9101.numberToWords(num3));
		
		int num4 = 1234567891;
		System.out.println("Nums :"+num4+",atter:"+solution9101.numberToWords(num4));
	
		int num5 = Integer.MAX_VALUE;
		System.out.println("Nums :"+num5+",atter:"+solution9101.numberToWords(num5));
	}
}
