package Study.Day37;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Li
 */
public class DataDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);
        System.out.println("d.getTime():" + d.getTime());
        long time = System.currentTimeMillis();
        d.setTime(time);
        System.out.println("d:" + d);

        // SimpleDateFormat
        // Date ---> String
        Date dd = new Date();
        // SimpleDateFormat sdf = new SimpleDateFormat();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        String s = sdf.format(dd);
        System.out.println("s:" + s);
        // String ---> Date
        String s1 = "2018-02-26 14:08:23";
        // ParseException
        // SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd1 = sdf1.parse(s1);
        System.out.println("s1:" +s1);

    }
}
