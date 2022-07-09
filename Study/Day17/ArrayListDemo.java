package Study.Day17;

import java.util.ArrayList;

/**
 * @author Li
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        /*
            java.util
                Class ArrayList<E>

            可调整大小的数组实现
            <E> 是一种特殊的数据类型, 泛型数据类型, 用于设置 objectName 的数据类型, 只能为引用数据类型
            怎么用呢?
               在出现 E 的地方使用引用数据类型替换即可
               举例: ArrayList<String>, ArrayList<Student>
            ArrayList 继承了 AbstractList ，并实现了 List 接口
        * */
        // 初始化一个String类型的数组
        ArrayList<String> a = new ArrayList();
        System.out.println("empty:" + a);
            // 以上等同 ArrayList<String> a = new ArrayList<>();

        // 设置 arraylist的容量大小  ensureCapacity() 方法将动态数组大小调整为可以存放 6 个元素。
        // Java 中的 ArrayList 可动态调整大小。也就是说, 如果我们在 arraylist 中添加 3 个以上的元素，它将自动调整自身大小，
        a.ensureCapacity(6);

        //add()方法增加
        a.add("Li");
        a.add("You");
        a.add("Xi");
        a.add("2017");
        a.add("Year");
        a.add("SeniorHighSchool");
        System.out.println("add:" + a);
        a.add(1, "Mao");
        System.out.println("add(1,'Mao'):" + a);
        // a.add(8, "noSeven"); ---> Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 8, Size: 7

        // remove 删除第四个元素
        a.remove(3);
        System.out.println("remove(3) 删除后集合内容为："+a);
        /*
            a.remove(10);   ---->  IndexOutOfBoundsException
        * */


        /*  removeIf() 方法的语法为：
                arraylist.removeIf(Predicate<E> filter)
                注：arraylist 是 ArrayList 类的一个对象。
                filter - 过滤器，判断元素是否要删除
        * */
        // 删除名称中带有 Li 的元素
        a.removeIf(e -> e.contains("Li"));
        System.out.println("removeIf('Li') 删除名称中带有 Li 的 ArrayList: " + a);

        // 第一个参数为索引位置，第二个为要修改的值
        a.set(2, "2018");
        System.out.println("set(2, ‘2018’) 修改后数组内容为：" + a);
        /*
            a.set(10, "10");    ---->  IndexOutOfBoundsException
        * */

        // 访问第二个元素 ,注意：数组的索引值从 0 开始。
        System.out.println("get(1) 第二个元素:" + a.get(1));
        /* System.out.println("a.get(10):" + a.get(10));    ---->  IndexOutOfBoundsException */

        //返回 arraylist 里元素数量
        System.out.println("size 元素数量为： "+a.size());

        //使用 for 来迭代数组列表中的元素
        System.out.println("用for循环遍历数组为：");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }

        System.out.println("使用 for-each 来迭代元素");
        for (String i: a) {
            System.out.println(i);
        }

        // 检查 Mao 是否在这个数组中
        System.out.print("Mao 是否存在于 arraylist: ");
        System.out.println(a.contains("Mao"));

        // 查找位置索引值为 Mao 的元素
        int position = a.indexOf("Mao");
        System.out.println("Mao 的索引位置: " + position);
        // 注意：数组的索引值从 0 开始

        /*
            删除所有元素
                a.clear();
                System.out.println("所有 clear() 方法后: " + a);

                a.removeAll(a);
                System.out.println("所有 removeAll() 方法后: " + a);
        */

        /* 检查该数组是否为空 false */
        System.out.println("数组 a 是否为空? " + a.isEmpty());
    }
}
/*
Java ArrayList 常用方法列表如下：
方法	                            描述
add()	            将元素插入到指定位置的 arraylist 中
addAll()	        添加集合中的所有元素到 arraylist 中
clear()	            删除 arraylist 中的所有元素
clone()	            复制一份 arraylist
contains()	        判断元素是否在 arraylist
get()	            通过索引值获取 arraylist 中的元素
indexOf()	        返回 arraylist 中元素的索引值
removeAll()	        删除存在于指定集合中的 arraylist 里的所有元素
remove()	        删除 arraylist 里的单个元素
size()	            返回 arraylist 里元素数量
isEmpty()	        判断 arraylist 是否为空
subList()	        截取部分 arraylist 的元素
set()	            替换 arraylist 中指定索引的元素
sort()	            对 arraylist 元素进行排序
toArray()	        将 arraylist 转换为数组
toString()	        将 arraylist 转换为字符串
ensureCapacity()	设置指定容量大小的 arraylist
lastIndexOf()	    返回指定元素在 arraylist 中最后一次出现的位置
retainAll()	        保留 arraylist 中在指定集合中也存在的那些元素
containsAll()	    查看 arraylist 是否包含指定集合中的所有元素
trimToSize()	    将 arraylist 中的容量调整为数组中的元素个数
removeRange()	    删除 arraylist 中指定索引之间存在的元素
replaceAll()	    将给定的操作内容替换掉数组中每一个元素
removeIf()	        删除所有满足特定条件的 arraylist 元素
forEach()	        遍历 arraylist 中每一个元素并执行特定操作
* */
