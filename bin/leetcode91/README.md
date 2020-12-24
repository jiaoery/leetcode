# 解题思路

本题思路在于将各个位数分开，可以看见其中的单位具备千（Thousand），百万（Million），十亿（Billion）这样的计量单位；那么就按照 这个标准划分出三个值；分别用变量 thousand，million，billion代表。然后这三个值在后缀追加单位的英文表示；然后对于这三个值，用统一的函数来解析：

* 首先引入 个位数（1~9）的表示（0除了特殊情况0外，不参与表示）
* 引入十位数；此时分为两个状态：
  * 十位数位为 1，就需要使用10~19的英文表示
  * 是为数位数为2~9，就需要使用20~90（间隔10，如Fifthty）

最后返回参数；

## 1.代码

```java
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
```

## 1.2 复杂度分析

* 时间复杂度：O(N),N为输入Integer参数的位数，因为每一位都需要处理
* 空间复杂度：O(1），除去结果字符，只是用有限的临时变量；