package leetcode141;

/**
 * ClassName: Solution14101<br/>
 * Description: TODO Description. <br/>
 * date: 2021/12/13 15:40<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution14101 {

    public static void main(String[] args) {
        TripleInOne tripleInOne1 = new TripleInOne(1);
        tripleInOne1.push(0,1);
        tripleInOne1.push(0,2);
        System.out.println("pop:"+tripleInOne1.pop(0));
        System.out.println("pop:"+tripleInOne1.pop(0));
        System.out.println("pop:"+tripleInOne1.pop(0));
        System.out.println("IsEmpty:"+ tripleInOne1.isEmpty(0));

        TripleInOne tripleInOne2 = new TripleInOne(2);
        tripleInOne2.push(0,1);
        tripleInOne2.push(0,2);
        tripleInOne2.push(0,3);
        System.out.println("pop:"+tripleInOne2.pop(0));
        System.out.println("pop:"+tripleInOne2.pop(0));
        System.out.println("pop:"+tripleInOne2.pop(0));
        System.out.println("peek:"+ tripleInOne2.peek(0));


    }
}
