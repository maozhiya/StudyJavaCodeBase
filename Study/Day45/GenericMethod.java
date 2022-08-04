package Study.Day45;
/*
public class Generic {
    public void show(String s) {
        System.out.println(s);
    }

    public void show(Integer i) {
        System.out.println(i);
    }

    public void show(Boolean b) {
        System.out.println(b);
    }
}
*/

//泛型类改进
//public class Generic<T> {
//    public void show(T t) {
//        System.out.println(t);
//    }
//}

/**
    泛型方法的定义格式：
    格式：修饰符 <类型> 返回值类型方法名(类型变量名){}
    范例：public <T> void show(T t){}
 * @author Li
 */

public class GenericMethod {
    /** 泛型方法改进 */
    public <T> void show(T t) {
        System.out.println(t);
    }
}
