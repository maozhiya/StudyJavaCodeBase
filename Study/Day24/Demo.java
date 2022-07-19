package Study.Day24;

/**
 * @author Li
 */
public class Demo {
    public int day = 23;
    public static void main(String[] args) {
        Son.old = 18;
        final String time = "2018";

        Son s = new Son();
        s.show();
        System.out.println("----------");
        System.out.println("time:" + time);
        System.out.println("before s.time:" + s.time);
        s.time = "1/15";
        System.out.println("after s.time:" + s.time);
        System.out.println("----- static -----");
        Son s1 = new Son();
        System.out.print("s1:");
        s1.universityShow();
        System.out.println(Son.old);
        Son s2 = new Son();
        System.out.print("s2:");
        s2.universityShow();
        System.out.println(Son.old);
    }
}
