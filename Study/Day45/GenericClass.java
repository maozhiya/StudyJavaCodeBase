package Study.Day45;

/**
 * @author Li
 */

/*
    泛型类的定义格式：
        格式：修饰符 class 类名<类型>{}
        泛例：public class Generic<T> {}
        T可以是任意标识
*/

public class GenericClass<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}