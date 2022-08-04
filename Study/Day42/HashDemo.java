package Study.Day42;

/**
 * @author Li
 */

/* 哈希值
    是JDK根据对象的地址或者字符串或者数字算出来的int类型的数值
        Object类中有一个方法可以获取对象的哈希值
        public int hashCode() 返回对象的哈希值

    对象的哈希值的特点:
        同一个对象多次调用hashCode()方法的哈希值相同
        不同对象调动的hashCode()方法哈希值不同,但是可以根据子类重写hashCode()方法让其相同


*/

public class HashDemo {
    public static void main(String[] args) {
        Student s = new Student("Li", 18);

        // 同一对象多次调用 hashCode() 方法返回的哈希值是相同的
        System.out.println(s.hashCode());
        System.out.println(s.hashCode());
        System.out.println("----------");

        // 默认情况下不同对象调用 hashCode() 返回的哈希值是不相同的, 但是可以通过方法重写实现不同对象哈希值相同
        Student s1 = new Student("Li", 18);
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println("----------");
    }
}
