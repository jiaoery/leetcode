import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;


/**
 * ClassName: Test<br/>
 * Description: TODO Description. <br/>
 * date: 2022/8/1 19:03<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
//        Date currentTime = new Date();
//        SimpleDateFormat formatter = new SimpleDateFormat("YYYYMMDDHHmmss");
//        String dateString = formatter.format(currentTime);
//        System.out.println(dateString);
//        Calculator calculator =new Calculator();
//        System.out.println("Java 7:"+Measure.measurePerf(calculator::sum,100000000)+" ms");
//        System.out.println("Java 8 with stream:"+Measure.measurePerf(calculator::sumWithStream,100000000)+" ms");

        ArrayList<String> list =new ArrayList<>();
        list.add("jiaorery");
        list.add("jiaorery1");
        list.add("jiaorery2");
        StringJoiner extIds = new StringJoiner(",");
            for (String sys : list) {
                if (sys != null) {
                    extIds.add(sys);
                }
        }
        String[] objects = (String[]) list.toArray(new String[list.size()]);
        System.out.println(objects);
    }



}
