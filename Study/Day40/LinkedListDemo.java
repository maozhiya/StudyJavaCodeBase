package Study.Day40;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Li
 */

/* LinkedList是Link(链表)的数据结构 */

/*
java.util.AbstractList<E>
    java.util.AbstractSequentialList<E>
        java.util.LinkedList<E>
*/

/*
    所有的操作执行，如可以预期的双链接列表。将索引到列表中的操作将遍历从开始或结束的列表，无论哪个更接近指定的索引。

*/


public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> arr = new LinkedList<String>();

        arr.add("You");
        arr.add("Love");
        arr.add("me");

        for (String s: arr) {
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
        System.out.println("arr:" + arr);
        /* addFirst(E e)
        在此列表的开始处插入指定的元素。*/
        arr.addFirst("first");
        System.out.println("addFirst:" + arr);

        /* addLast(E e)
        将指定的元素列表的结束。*/
        arr.addLast("last");
        System.out.println("addLast:" + arr);

        /* get(int index)
        返回此列表中指定位置的元素。*/
        System.out.println("arr.get(1):" + arr.get(1));

        /* getFirst()
        返回此列表中的第一个元素。*/
        System.out.println("getFirst():" + arr.getFirst());

        /* getLast()
        返回此列表中的最后一个元素。*/
        System.out.println("getLast():" + arr.getLast());


        /* removeFirst()
        移除并返回此列表中的第一个元素。*/
        arr.removeFirst();
        System.out.println("removeFirst:" + arr);

        /* removeLast()
        移除并返回此列表中的最后一个元素。*/
        arr.removeLast();
        System.out.println("removeLast:" + arr);

    }
}
