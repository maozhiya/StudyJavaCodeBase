package Study.Day42;

import java.util.HashSet;

/**
 * @author Li
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<String>();

        hash.add("1");
        hash.add("3");
        hash.add("2");
        hash.add("2");

        for (String s : hash) {
            System.out.println(s);
        }


    }
}
