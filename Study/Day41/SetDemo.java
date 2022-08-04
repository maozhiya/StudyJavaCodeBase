package Study.Day41;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Li
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("1");
        set.add("2");
        set.add("4");
        set.add("3");

        System.out.println("set:" + set);
        System.out.println("set:" + set);

        for (String s : set) {
            System.out.println(s);
        }
    }
}
