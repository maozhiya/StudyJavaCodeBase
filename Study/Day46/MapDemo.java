package Study.Day46;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Li
 */

/*  Map集合
        1.Map是一个双列集合，一个元素包含两个值（一个key，一个value）
        2.Map集合中的元素，key和value的数据类型可以相同，也可以不同
        3.Map中的元素，key不允许重复，value可以重复
        4.Map里的key和value是一一对应的。

    Map中的方法:
        1. public   V  put （K key，V value） 把指定的键和值添加到Map集合中，返回值是V
            如果要存储的键值对，key不重复返回值V是null
            如果要存储的键值对，key重复返回值V是被替换的value值
        2. public  V remove（Object key）把指定键所对应的键值对元素，在Map集合中删除，返回被删除的元素的值。 返回值：V 。
            如果key存在，返回被删除的值，如果key不存在，返回null
        3. boolean containsKey（ Object key）判判断集合中是否包含指定的键
            包含返回true，不包含返回false
        4. isEmpty()
            返回 true如果这个Map不包含键值的映射。
        5. clear()
            从这个映射中移除所有的映射。
        6. containsValue(Object value)
            返回 true如果映射到指定的值的一个或多个键
        7. size()
            返回这个映射中的键值映射的数目。
    遍历Map集合的方式
        1.通过键找值的方法；
            使用了setKey方法，将Map集合中的key值，存储到Set集合，用迭代器或foreach循环遍历Set集合来获取Map集合的每一个key，并使用get（key）方法来获取value值
        2.使用Entry对象遍历
            Map.Entry<K,V>,在Map接口中有一个内部接口Entry（内部类）
                作用：当集合一创建，就会在Map集合中创建一个Entry对象，用来记录键与值（键值对对象，键值的映射关系）

    Map的常用实现类
        HashMap
            特点
                1.HashMap底是哈希表，查询速度非常快
                    （jdk1.8之前是数组+单向链表，1.8之后是数组+单向链表/红黑树 ，链表长度超过8时，换成红黑树）
                2. HashMap是无序的集合，存储元素和取出元素的顺序有可能不一致
                3.集合是不同步的，也就是说是多线程的，速度快
            HashMap存储自定义类型键值
                HashMap存储自定义类型键值，Map集合保证key是唯一的：作为key的元素，必须重写hashCode方法和equals方法，以保证key唯一
        LinkedHashMap
            HashMap有子类LinkedHashMap：LinkedHashMap <K,V> extends HashMap <K,V>
            HashMap：底层也是哈希表，但是线程不安全的集合，是多线程集合，速度快
            HashMap（还有之前学的所有集合）：都可以存储null键，null值
            是Map接口的哈希表和链表的实现，具有可预知的迭代顺序（有序）
            底层原理：哈希表+链表（记录元素顺序）
            特点
                1.LinkedHashMap底层是哈希表+链表（保证迭代的顺序）
                2.LinkedHashMap是一个有序的集合，存储元素和取出元素的顺序一致
                改进之处就是：元素存储有序了
        Hashtable
            Hashtable<K,V> implements Map<K,V>
            Hashtable：底层也是哈希表，是同步的，是一个单线程结合，是线程安全的集合，速度慢
            Hashtable：不能存储null键，null值

*/

public class MapDemo {
    public static void main(String[] args) {
        // Map集合
        HashMap<String, Integer> map = new HashMap<>();

        /* 1. public   V  put （K key，V value） 把指定的键和值添加到Map集合中，返回值是V
        如果要存储的键值对，key不重复返回值V是null
        如果要存储的键值对，key重复返回值V是被替换的value值 */

        map.put("I", 1);
        map.put("Love", 2);
        map.put("You", 3);
        map.put("me", 4);
        map.put("me", 5);
        map.put("Your", 3);

        System.out.println("map:" + map);

        /* 2. public  V remove（Object key）把指定键所对应的键值对元素，在Map集合中删除，返回被删除的元素的值。 返回值：V 。
        如果key存在，返回被删除的值，如果key不存在，返回null */
        map.remove("me");
        System.out.println("map.remove('me'):" + map.remove("Yours"));
        System.out.println("map.remove('me'):" + map);

        /* 3. boolean containsKey（ Object key）判判断集合中是否包含指定的键
        包含返回true，不包含返回false */
        System.out.println("map.containsKey('You'):" + map.containsKey("You"));

        /* 6. containsValue(Object value)
        返回 true如果映射到指定的值的一个或多个键 */
        System.out.println("map.containsValue(3):" + map.containsValue(3));

        /* 7. size()
        返回这个映射中的键值映射的数目。 */
        System.out.println("map.size():" + map.size());

        /* 5. clear()
        从这个映射中移除所有的映射。 */
        map.clear();

        /* 4. isEmpty()
        返回 true如果这个Map不包含键值的映射。 */
        System.out.println("map.isEmpty():" + map.isEmpty());

        /*
            Map集合的获取功能：
                V get(Object key):根据键获取值
                Set<K> keySet():获取所有键的集合
                Collection<V> values():获取所有值的集合
        */
        map.put("I", 1);
        map.put("Love", 2);

        map.put("You", 3);
        map.put("Your", 3);

        map.put("me", 4);
        map.put("me", 5);


        System.out.println("map.get('me'):" + map.get("me"));

//        /*
//        Set<String> keySet = map.keySet();
//        for (String key : keySet)
//        {
//            System.out.println("key:" + key);
//        }
//        Collection<Integer> values = map.values();
//        for (Integer value : values){
//            System.out.println("value:" + value);
//        }
//        */

        System.out.println("key:");
        for (String key : map.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println("value:");
        for (Integer value : map.values()) {
            System.out.print(value + " ");
        }

        /* 遍历Map集合的方式
        1.通过键找值的方法；
        使用了setKey方法，将Map集合中的key值，存储到Set集合，用迭代器或foreach循环遍历Set集合来获取Map集合的每一个key，并使用get（key）方法来获取value值
        2.使用Entry对象遍历
        Map.Entry<K,V>,在Map接口中有一个内部接口Entry（内部类）
        作用：当集合一创建，就会在Map集合中创建一个Entry对象，用来记录键与值（键值对对象，键值的映射关系） */

        System.out.println("-----遍历-----");
        /* Set<String> keySet = map.keySet(); */
        for (String key : map.keySet()) {
            //根据键去找值。用get(Object key)方法实现
            /* String value = map.get(key); */
            System.out.println(key + "," + map.get(key));
        }
        System.out.println("----------");
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> me : entrySet) {
            //根据键值对对象获取键和值
            String key = me.getKey();
            Integer value = me.getValue();
            System.out.println(key + "," + value);
        }
    }
}
