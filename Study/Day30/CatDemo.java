package Study.Day30;

/**
 * @author Li
 */
public class CatDemo {
    /*
    类名作为形参和返回值
        .方法的参数是类名，其实需要的是该类（实例化）后的对象
        .方法的返回值为类名，其实返回的是该类的对象
    抽象类名作为形参和返回值
        .方法的参数是抽象类名，其实需要的是该抽象类的子类对象2
        .方法的返回值为抽象类名，其实返回的是该抽象类的子类对象->抽象类的方法里面是没有值的，只有重写过才会有值
     */

    /*
    1. 参数传递
    1.1 类名作为形参和返回值
        1、类名作为方法的形参
            方法的形参是类名，其实需要的是该类的对象
            实际传递的是该对象的【地址值】
        2、类名作为方法的返回值
            方法的返回值是类名，其实返回的是该类的对象
            实际传递的，也是该对象的【地址值】
    */

    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        CatOperator co = new CatOperator();
        // 前提是这个参数对象必须实例化，才能被访问
        Cat c = new Cat ();
        System.out.print("co.useCat(c):");
        co.useCat(c);
        // co.getCat() = new Cat ()
        Cat c2 = co.getCat();
        System.out.print("c2.eat():");
        c2.eat();
    }
}
