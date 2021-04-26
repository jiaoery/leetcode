package leetcode123;

/**
 * ClassName: Solution<br/>
 * Description: 完美数
 * date: 2021/4/26 11:04<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution12301 {
    public boolean checkPerfectNumber(int num) {
        //1必须要除去本身
        if(num==1){
            return false;
        }
        int sum =0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if(num%i==0){
                sum += i;
                sum += num/i;
            }
        }
        //sum里面有num本身  sum-num = num -> sum=2*num
        return sum==2*num;
    }

    public static void main(String[] args) {
        Solution12301 solution =  new Solution12301();
        int nums1 = 4;
        System.out.println("nums:"+nums1+";Is PerfectNumber ? "+solution.checkPerfectNumber(nums1));

        int nums2 = 1;
        System.out.println("nums:"+nums2+";Is PerfectNumber ? "+solution.checkPerfectNumber(nums2));

        int nums3 = 28;
        System.out.println("nums:"+nums3+";Is PerfectNumber ? "+solution.checkPerfectNumber(nums3));

        int nums4 = 6;
        System.out.println("nums:"+nums4+";Is PerfectNumber ? "+solution.checkPerfectNumber(nums4));

        int nums5 = 8128;
        System.out.println("nums:"+nums5+";Is PerfectNumber ? "+solution.checkPerfectNumber(nums5));
    }
}
