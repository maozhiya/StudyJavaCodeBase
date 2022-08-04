package Study.Day38;

import java.util.Scanner;

/**
 * @author Li
 */

/*
    Java中 throw 和 throws:
        1、throw 在方法体内使用，throws 在方法声明上使用
        2、throw 后面接的是异常对象，只能接一个。throws 后面接的是异常类型，可以接多个，多个异常类型用逗号隔开
        3、throw 是在方法中出现不正确情况时，手动来抛出异常，结束方法的，执行了 throw 语句一定会出现异常。而 throws 是用来声明当前方法有可能会出现某种异常的，如果出现了相应的异常，将由调用者来处理，声明了异常不一定会出现异常

    throw 和 throws 都是用来进行 Java 异常处理的
*/

public class CustomDemo extends Exception{
    public static void main(String[] args) throws ExceptionDemo {
        Scanner sc = new Scanner(System.in);
        System.out.println("input score:");

        int score = sc.nextInt();
        try {
            if(score<0 || score>100) {
                throw new ExceptionDemo("NulL");
            }
            else {
                System.out.println("Normal");
            }
        } catch (ExceptionDemo e) {
            e.printStackTrace();
        }
    }
}
