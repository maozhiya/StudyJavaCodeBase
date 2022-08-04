package Study.Day39;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Li
 */

/*
    List 是一个有序、可重复的集合，集合中每个元素都有其对应的顺序索引。
    List 实现了 Collection 接口，它主要有两个常用的实现类：
            ArrayList 类和 LinkedList 类。
*/

public class ListDemo {
    public static void main(String[] args) {
        /* public interface List<E> extends Collection<E> */
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("Li");
        list.add("World");

        System.out.println("list:" + list);

        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("----------");

        list.add(1,"Java");
        System.out.println("list.add(1,Java):" + list);

        list.remove(1);
        System.out.println("list.remove(1):" + list);

        list.set(3, "Java");
        System.out.println("list.set(3, Java):" + list);

        System.out.println("list.get(1):" + list.get(1));

        System.out.println("----------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
