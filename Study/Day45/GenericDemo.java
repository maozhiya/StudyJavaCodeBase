package Study.Day45;

import java.util.*;

/**
 * @author Li
 */

/*
    Java 集合有个缺点，就是把一个对象“丢进”集合里之后，集合就会“忘记”这个对象的数据类型，当再次取出该对象时，该对象的编译类型就变成了 Object 类型（其运行时类型没变）。
    泛型可以在编译的时候检查类型安全，并且所有的强制转换都是自动和隐式的，提高了代码的重用率。

    泛型本质上是提供类型的“类型参数”，也就是参数化类型。
        我们可以为类、接口或方法指定一个类型参数，通过这个参数限制操作的数据类型，从而保证类型转换的绝对安全。

    泛型定义格式：
        <类型>：指定一种类型的格式。这里的类型可以看成是形参。
        <类型1,类型2…>：指定多种类型的格式，多种类型用逗号隔开，这里的类型可以看成是形参。
        将来具体调用时候给定的类型可以看成是实参，并且实参的类型只能是引用数据类型。

    定义泛型方法的规则：
        所有泛型方法声明都有一个类型参数声明部分（由尖括号分隔），该类型参数声明部分在方法返回类型之前（在下面例子中的<E>）。
        每一个类型参数声明部分包含一个或多个类型参数，参数间用逗号隔开。一个泛型参数，也被称为一个类型变量，是用于指定一个泛型类型名称的标识符。
        类型参数能被用来声明返回值类型，并且能作为泛型方法得到的实际参数类型的占位符。
        泛型方法方法体的声明和其他方法一样。注意类型参数只能代表引用型类型，不能是原始类型（像int,double,char的等）。

    泛型的好处：
        把运行时期的问题提前到了编译期间
        避免了强制类型转换

    泛型类的定义格式：
        格式：修饰符 class 类名<类型>{}
        泛例：public class Generic<T> {}
        T可以是任意标识

    泛型方法的定义格式：
        格式：修饰符 <类型> 返回值类型方法名(类型变量名){}
        范例：public <T> void show(T t){}

    泛型接口的定义格式：
        格式：修饰符 interface 接口名<类型>{}
        范例：public interface Generic <T>{}

    类型通配符
        类型通配符：<?>
            List<?>：表示元素类型未知的List，它的元素可以匹配任何的类型
            这种带通配符的List仅表示它是各种泛型List的父类，并不能把元素添加到其中
        类型通配符上限：<?extends类型>
            List<? extends Number>：表示的类型是Number或者其子类型
        类型通配符下限：<?super类型>
            List<?super Number>：表示的类型是Number或者其父类型
    */

public class GenericDemo {
    public static void main(String[] args) {
//        /*
//        创建集合对象
//        Collection c = new ArrayList();
//        添加元素
//        c.add("hello");
//        c.add("world");
//        c.add("java");
//        c.add(100);
//        //遍历集合
//        // Iterator it = c.iterator();
//        Iterator<String> it = c.iterator();
//        while (it.hasNext()) {
//            Object obj = it.next();
//            System.out.println(obj);
//            String s = (String)it.next(); //ClassCastException
//        }
//        */

        Collection<String> c = new ArrayList<String>();
        //添加元素
        c.add("hello");
        c.add("world");
        c.add("java");
        // c.add(100);

        Iterator<String> it = c.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        GenericClass<String> g1 = new GenericClass<String>();
        g1.setT("Li");
        System.out.println("g1.getT():" + g1.getT());

        GenericClass<Integer> g2 = new GenericClass<Integer>();
        g2.setT(18);
        System.out.println("g2.getT():" + g2.getT());

        GenericClass<Boolean> g3 = new GenericClass<Boolean>();
        g3.setT(true);
        System.out.println("g3.getT():" + g3.getT());

        GenericInterface<String> interfaceDemo1 = new GenericInterfaceDemo<String>();
        System.out.print("interfaceDemo1.show('Li'):");
        interfaceDemo1.show("Li");

        GenericInterface<Integer> interfaceDemo2 = new GenericInterfaceDemo<Integer>();
        System.out.print("interfaceDemo2.show(18):");
        interfaceDemo2.show(18);

        /*
        类型通配符
        类型通配符：<?>
            List<?>：表示元素类型未知的List，它的元素可以匹配任何的类型
            这种带通配符的List仅表示它是各种泛型List的父类，并不能把元素添加到其中
        类型通配符上限：<?extends类型>
            List<? extends Number>：表示的类型是Number或者其子类型
        类型通配符下限：<?super类型>
            List<?super Number>：表示的类型是Number或者其父类型
        */

        //类型通配符：<?>
        List<?> list1 = new ArrayList<Object>();
        List<?> list2 = new ArrayList<Number>();
        List<?> list3 = new ArrayList<Integer>();
        System.out.println("--------");

        //类型通配符上限：<? extends 类型>
        // List<? extends Number> list4 = new ArrayList<Object>();
        List<? extends Number> list5 = new ArrayList<Number>();
        List<? extends Number> list6 = new ArrayList<Integer>();
        System.out.println("--------");

        //类型通配符下限：<? super 类型>
        List<? super Number> list7 = new ArrayList<Object>();
        List<? super Number> list8 = new ArrayList<Number>();
        // List<? super Number> list9 = new ArrayList<Integer>();

        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));

        /*
        Arrays工具类中有一个静态方法：
            public static <T> List<T> asList​(T... a)：返回由指定数组支持的固定大小的列表

        List接口中有一个静态方法：
            public static <E> List<E> of​(E... elements)：返回包含任意数量元素的不可变列表

        Set接口中有一个静态方法：
            public static <E> Set<E> of​(E... elements) ：返回一个包含任意数量元素的不可变集合
        */

/**
       // public static <T> List<T> asList​(T... a)：返回由指定数组支持的固定大小的列表
        List<String> list = Arrays.asList("hello", "world", "java");
        System.out.println(list);
        // list.add("javaee"); //UnsupportedOperationException
        // list.remove("world"); //UnsupportedOperationException
        list.set(1,"javaee");
        System.out.println("list.set(1,'javaee');:" + list);
*/

/**
        // public static <E> List<E> of​(E... elements)：返回包含任意数量元素的不可变列表
        List<String> listTwo = List.of("hello", "world", "java", "world");
        // list.add("javaee");//UnsupportedOperationException
        // list.remove("java");//UnsupportedOperationException
        // list.set(1,"javaee");//UnsupportedOperationException
        System.out.println(listTwo);
*/

/**
        //public static <E> Set<E> of​(E... elements) ：返回一个包含任意数量元素的不可变集合
        // Set<String> set = Set.of("hello", "world", "java","world"); //IllegalArgumentException
        Set<String> set = Set.of("hello", "world", "java");
        // set.add("javaee");//UnsupportedOperationException
        // set.remove("world");//UnsupportedOperationException
        System.out.println(set);
*/
    }

    public static int sum(int... a) {
        int sum = 0;
        for(int i : a) {
            sum += i;
        }
        return sum;
    }
}
