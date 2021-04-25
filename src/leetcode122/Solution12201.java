package leetcode122;

/**
 * ClassName: Solution12201<br/>
 * Description: TODO Description. <br/>
 * date: 2021/4/25 15:37<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution12201 {
    public int divide(int dividend, int divisor) {
        //处理特殊情况
        if(dividend==0){
            return 0;
        }
        if(divisor ==1){
            return dividend;
        }
        //MIN_VALUE 会超域
        if(divisor==-1){
            if(dividend==Integer.MIN_VALUE){
                return Integer.MAX_VALUE;
            }else{
                return -dividend;
            }
        }

        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);
        //是否为负数
        boolean negative = (dividend>0&&divisor<0)||(dividend<0&&divisor>0);
        long result  = div(a,b);

        //若为负数
        if(!negative){
           return result>Integer.MAX_VALUE?Integer.MAX_VALUE: (int) result;
        }else {
            return (int) -result;
        }
    }

    //递归运算
    public long div(long a, long b){
        if(a<b) return 0;
        long count = 1;
        long tb = b; // 在后面的代码中不更新b
        while((tb<<1)<=a){
            //位移一位
            count = count <<1;
            //测试值也位移一位
            tb = tb<<1; // 当前测试的值也翻倍
        }
        return count + div(a-tb,b);
    }

    public static void main(String[] args) {
        Solution12201 solution =  new Solution12201();
//        int dividend1 = 10, divisor1 = 3;
//        System.out.println("dividend:"+dividend1+",divisor:"+divisor1+";result:"+solution.divide(dividend1,divisor1));
//
//        int dividend2 = 7, divisor2 = 2;
//        System.out.println("dividend:"+dividend2+",divisor:"+divisor2+";result:"+solution.divide(dividend2,divisor2));

        int dividend3 = -2147483648, divisor3 = 2;
        System.out.println("dividend:"+dividend3+",divisor:"+divisor3+";result:"+solution.divide(dividend3,divisor3));
    }

}
