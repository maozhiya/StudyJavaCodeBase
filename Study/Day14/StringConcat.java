package Study.Day14;

/**
 * @author Li
 */

/*
    字符串拼接:
        一、“+” 操作符
            “+” 操作符是字符串拼接最常用的方法之一
            编译的时候会把 “+” 操作符替换成了 StringBuilder 的 append 方法。

        二、StringBuilder(非线程安全)
            StringBuilder 的 append 方法就是第二个常用的字符串拼接方法

        三、StringBuffer(线程安全)
            StringBuffer 的 append 方法比 StringBuilder 多了一个关键字 synchronized，可暂时忽略 toStringCache = null。

        四、String 类的 concat 方法
            简单来看，String 类的 concat 方法就好像 StringBuilder 类的 append
            要探究 “+” 操作符和 concat 之间的差别，实际上要看 append 方法和 concat 方法之间的差别

        五、String 类的 join 方法
            JDK 1.8 提供了一种新的字符串拼接方法：String 类增加了一个静态方法 join

        六、StringUtils.join
            项目中处理字符串的时候，经常会用到这个类——org.apache.commons.lang3.StringUtils，该类的 join 方法是字符串拼接的一种新姿势
            该方法更善于拼接数组中的字符串，并且不用担心 NullPointerException
            查看源码可以发现，其内部使用的仍然是 StringBuilder

        七、不建议在 for 循环中使用 “+” 进行字符串拼接
            第一段，for 循环中使用 “+” 操作符
            String result = "";
                for (int i = 0; i < 100000; i++) {
                 result += "六六六";
            }
            第二段，for 循环中使用 append
            StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 100000; i++) {
                 sb.append("六六六");
            }
            这两段代码分别会耗时测试结果如下：
            ①第一段代码执行完的时间为 6212 毫秒
            ②第二段代码执行完的时间为 1 毫秒
                第一段的 for 循环中创建了大量的 StringBuilder 对象
                而第二段代码至始至终只有一个 StringBuilder 对象
                所以不建议在 for 循环中使用 “+” 进行字符串拼接
* */

public class StringConcat {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        // 调用方法
        String s = arrayToString(arr);

        System.out.println("s:" + s);
    }
    public static String arrayToString(int[] arr) {
        // “+” 操作符
        String s = "";
        s += "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length  - 1) {
                s += arr[i];
            } else {
                s += arr[i];
                s += ", ";
            }
        }
        s += "]";

        return s;
    }
}
