package Study.Day39;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Li
 */

/* Collection 接口是 List、Set 和 Queue 接口的父接口，通常情况下不被直接使用。 */

/*
    创建Collection集合的对象
        多态的方式
        ArrayList()

    alt + 7  打开 类 的信息窗口
 */

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        /* add(E e)
        确保此集合包含指定的元素（可选操作）。*/
        c.add("Hello");
        c.add("World");
        c.add("World");
        System.out.println("c:" + c);
        c.add("Li");
        System.out.println("c.add('Li'):" + c);

        /* remove(Object o)
        从这个集合中移除指定元素的一个实例，如果它是存在的（可选操作）。 */
        c.remove("World");
        System.out.println("c.remove('World'):" + c);

        /* contains(Object o)
        返回 true如果集合包含指定元素。*/
        System.out.println("c.contains('Hello'):" + c.contains("Hello"));

        /* size()
        返回此集合中的元素的数目。 */
        System.out.println("c.size():" + c.size());

        /* clear()
        从这个集合中移除所有的元素（可选操作）。 */
        c.clear();
        System.out.println("c.clear():" + c);

        /* isEmpty()
        返回 true如果集合不包含任何元素。 */
        System.out.println("c.isEmpty():" + c.isEmpty());

        // Iterator<E> iterator() 返回此集合中的元素的迭代器。有没有关于返回元素的顺序的保证（除非这个集合是提供保证的类的一个实例）。
        c.add("Hello");
        c.add("World");
        c.add("Java");

        Iterator<String> it = c.iterator();
        System.out.println("it.next():" + it.next());
        System.out.println("it.next():" + it.next());
        System.out.println("it.next():" + it.next());
        // NoSuchElementException
        // System.out.println("it.next():" + it.next());

        if (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("----------");
        Collection<String> co = new ArrayList<String>();
        co.add("Hello");
        co.add("World");
        co.add("Java");
        Iterator It = co.iterator();
        while (It.hasNext()) {
            // System.out.println(It.next());

            String s = (String) It.next();
            System.out.println(s);
        }

    }
}
