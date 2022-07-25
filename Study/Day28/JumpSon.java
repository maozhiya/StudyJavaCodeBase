package Study.Day28;

/**
 * @author Li
 */

/* 一个接口不能够实现另一个接口，但它可以继承多个其他接口 */

/* public interface JumpSon implements Jump {} */

public interface JumpSon extends JumpDad, JumpMom{
    /*
        实现接口与继承父类相似，一样可以获得所实现接口里定义的常量和方法。
        如果一个类需要实现多个接口，则多个接口之间以逗号分隔。
    */

    /* 一个接口不能够实现另一个接口，但它可以继承多个其他接口 */

    /** 子接口可以对父接口的方法和常量进行重写 */


}
