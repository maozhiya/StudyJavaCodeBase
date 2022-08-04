package Study.Day43;

import java.util.*;

/**
 * @author Li
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Student> hash = new HashSet<Student>();

        Student s1 = new Student("I", 17);
        Student s2 = new Student("Love", 18);
        Student s3 = new Student("You", 19);
        Student s4 = new Student("I", 17);

        hash.add(s1);
        hash.add(s2);
        hash.add(s3);
        // 为了防止出现s4相同的内容 需要重写 HashSet 方法
        hash.add(s4);

        for (Student s : hash
             ) {
            System.out.println(s.getName() + "," + s.getAge());
        }
        System.out.println("----------");
        Iterator it = hash.iterator();
        while (it.hasNext()) {
            Student s = (Student) it.next();
            System.out.println(s.getName() + "," + s.getAge());
        }
        System.out.println("-----linkedHashSet-----");
        /*
            LinkedHashSet是HashSet的子类，底层是一个LinkedHashMap，维护了一个数组 + 双向链表
                和HashSet不同的是，双向链表可以维护元素的次序，这使得元素看起来是以插入顺序保存的
                同样的，LinkedHashSet也不允许添加重复元素
        */
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

        linkedHashSet.add("I");
        linkedHashSet.add("Love");
        linkedHashSet.add("You");

        for (String s : linkedHashSet
             ) {
            System.out.println(s);
        }
    }
}
