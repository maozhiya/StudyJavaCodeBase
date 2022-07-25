package Study.Day28;

/**
 * @author Li
 */

/*
    Java 接口
    抽象类是从多个类中抽象出来的模板，如果将这种抽象进行的更彻底，则可以提炼出一种更加特殊的“抽象类”——接口
    接口是 Java 中最重要的概念之一，它可以被理解为一种特殊的类，不同的是接口的成员没有执行体，是由全局常量和公共的抽象方法所组成。

    定义接口
        Java 接口的定义方式与类基本相同，不过接口定义使用的关键字是 interface，接口定义的语法格式如下：

    [public] interface interface_name [extends interface1_name[, interface2_name,…]] {
        // 接口体，其中可以包含定义常量和声明方法
        [public] [static] [final] type constant_name = value;    // 定义常量
        [public] [abstract] returnType method_name(parameter_list);    // 声明方法
    }
    对以上语法的说明如下：
    public 表示接口的修饰符，当没有修饰符时，则使用默认的修饰符，此时该接口的访问权限仅局限于所属的包；
    interface_name 表示接口的名称。接口名应与类名采用相同的命名规则，即如果仅从语法角度来看，接口名只要是合法的标识符即可。如果要遵守 Java 可读性规范，则接口名应由多个有意义的单词连缀而成，每个单词首字母大写，单词与单词之间无需任何分隔符。
    extends 表示接口的继承关系；
    interface1_name 表示要继承的接口名称；
    constant_name 表示变量名称，一般是 static 和 final 型的；
    returnType 表示方法的返回值类型；
    parameter_list 表示参数列表，在接口中的方法是没有方法体的。
    注意：一个接口可以有多个直接父接口，但接口只能继承接口，不能继承类。

 */


public class JumpDemo {
    public static void main(String[] args) {
        /* Jump j = new Jump(); */

        Jump j = new Cat();
        j.jump();


    }
}
