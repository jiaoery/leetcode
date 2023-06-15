import java.util.function.Function;

/**
 * ClassName: Measure<br/>
 * Description: TODO Description. <br/>
 * date: 2022/11/8 18:14<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Measure {
    public static <T, R> long measurePerf(Function<T, R> f, T input) {
        long start = System.currentTimeMillis();
        R result = f.apply(input);
        long during = System.currentTimeMillis() - start;
        System.out.println(result);
        return during;
    }
}
