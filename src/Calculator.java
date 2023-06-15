import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * ClassName: Calculator<br/>
 * Description: TODO Description. <br/>
 * date: 2022/11/8 18:12<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Calculator {


    public long sum(int n){
        long sum =0;
        for (int i = 1; i <=n ; i++) {
            sum+=i;
        }
        return sum;
    }

    public long sumWithStream(int n){
       return LongStream.rangeClosed(1,n)
                .sum();
    }
}
