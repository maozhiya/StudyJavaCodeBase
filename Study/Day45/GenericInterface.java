package Study.Day45;

/*
    泛型接口的定义格式：
        格式：修饰符 interface 接口名<类型>{}
        范例：public interface Generic <T>{}
*/

/**
 * @author Li
 */

public interface GenericInterface<T> {
    /** GenericInterface<T> */
    void show(T t);
}
