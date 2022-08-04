package Study.Day40;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Li
 */

/* ArrayList是Array(动态数组)的数据结构 */

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();

        arr.add("I");
        arr.add("Love");
        arr.add("You");

        for (String s : arr
             ) {
            System.out.println(s);
        }
        System.out.println("----------");
        Iterator it = arr.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }
        System.out.println("----------");
        Iterator It = arr.iterator();
        for (int i = 0; i < arr.size(); i++) {
            String s = arr.get(i);
            System.out.println(s);
        }

    }
}
