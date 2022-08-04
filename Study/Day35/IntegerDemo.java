package Study.Day35;

import java.lang.annotation.Native;

/**
 * @author Li
 */

/*
* 为什么需要包装类
    Java是面向对象的语言，很多地方都是需要使用对象而不是基本数据类型的
    比如在集合类中，无法将int等数据类型放进去，因为集合的容器要求元素是 Object 类型
    为了让基本类型也具有对象特性，就出现了包装类型，丰富了基本类型的操作
*/


public class IntegerDemo {
    public static void main(String[] args) {
        /* 判断一个数据是否在 int 范围 2**-31 -- 2**31*/

        /* public final class Integer extends Number implements Comparable<Integer> {

         * A constant holding the minimum value an {@code int} can
         * have, -2<sup>31</sup>.
         *
        @Native
        public static final int   MIN_VALUE = 0x80000000;

         * A constant holding the maximum value an {@code int} can
         * have, 2<sup>31</sup>-1.
         *
        @Native
        public static final int   MAX_VALUE = 0x7fffffff;*/

        /* 这类包装 Integer值对象中的原始类型 int。 Integer类型的对象包含一个字段的类型是 int。 */
        /* 此外，该类提供了一个int转换到String和String到int的几种方法，以及其他有用的常量和方法在处理int。*/

        System.out.println("Integer.MIN_VALUE:" + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE:" + Integer.MAX_VALUE);

        /*
        public static Integer valueOf(String s) throws NumberFormatException {
            return Integer.valueOf(parseInt(s, 10));
        }
        */

        /* Integer(int value) 构建了一个新分配的 Integer表示指定的 int价值。 */
        Integer i1 = new Integer(2019);
        System.out.println("i1:" + i1);

        Integer i11 = Integer.valueOf(2019);
        System.out.println("i11:" + i11);

        /* Integer(String s) 构建了一个新分配的 Integer表示 int值表示的 String参数。*/
        Integer i2 = new Integer("17");
        System.out.println("i2:" + i2);

        // NumberFormatException
        /*Integer i3 = new Integer("abc");
        System.out.println("i3:" + i3);*/

        Integer i22 = Integer.valueOf("17");
        System.out.println("i22:" + i22);

        // NumberFormatException
        /*Integer i33 = Integer.valueOf("abc");
        System.out.println("i33:" + i33);*/

    }
}
