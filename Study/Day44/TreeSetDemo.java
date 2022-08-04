package Study.Day44;

import java.util.TreeSet;

/**
 * @author Li
 */

/*
    TreeSet 简介
        TreeSet 是一个有序集合，它的作用是提供有序的Set集合。其继承于 AbstractSet 类
        TreeSet 实现了 NavigableSet 接口，意味着它支持一系列的导航方法。比如查找指定目标最匹配项
        TreeSet 实现了 Serializable 接口，因此它支持序列化
        TreeSet 是通过 TreeMap 实现的一个有序的、不可重复的集合，底层维护的是红黑树结构。当TreeSet的泛型对象不是java的基本类型的包装类时，对象需要重写 Comparable#compareTo(）方法
*/

public class TreeSetDemo {
    public static void main(String[] args) {
        /*
        TreeSet的构造方法
            //默认构造方法。使用改
            TreeSet()

            // 创建的 TreeSet 包含 collection
            TreeSet(Collection<? extends E> collection)

            // 指定 TreeSet 的比较器
            TreeSet(Comparator<? super E> comparator)

            // 创建的 TreeSet 包含set
            TreeSet(SortedSet<E> set)

        TreeSet的常用方法
        说明：TreeSet是有序的Set集合，因此支持add、remove、get等方法。
        */

        TreeSet<Integer> ts = new TreeSet<Integer>();

        ts.add(10);
        ts.add(40);
        ts.add(20);
        ts.add(30);
        ts.add(10);

        for (int i : ts
             ) {
            System.out.println(i);
        }
    }
}
