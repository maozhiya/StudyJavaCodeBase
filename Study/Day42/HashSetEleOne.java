package Study.Day42;

import java.util.HashSet;

/**
 * @author Li
 */

/* hashSet 集合保证元素唯一性源码分析 */

public class HashSetEleOne {
    public static void main(String[] args) {
        HashSet<String> Ele = new HashSet<String>();

        Ele.add("1");
        Ele.add("3");
        Ele.add("2");
        Ele.add("2");

        for (String s : Ele) {
            System.out.println(s);
        }
    }
}
