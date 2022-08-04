package Study.Day39;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Li
 */

/*
    增强for循环:
        Java5 所引入的一种主要用于数组的增强型for循环。（可用来遍历数组）
    声明语句:
        声明新的局部变量，该变量的类型必须和数组元素的类型匹配。其作用域限定在循环语句块，其值与此时数组元素的值相等。
    优缺点:
        只能从头到尾的遍历数组或集合，而不能只遍历部分
        在遍历List或数组时，不能获取当前元素下标
        只能访问当前的元素，而不能对其进行改变
        在循环过程中，对数组元素进行赋值，foreach中的循环变量相当于一个临时变量，系统会把数组元素依次赋给这个临时变量，而这个临时变量并不是数组元素，它只是保存了数组元素的值。因此如果希望改变数组元素的值，则不能使用foreach循环。
    底层原理:
        增强for循环内部是使用迭代器完成的，任何实现了Iterable接口的对象都可以被增强for循环遍历，这也是为什么增强for可以循环遍历集合的原因(Collection是Iterable的子接口)。但是Map并没有实现Iterable接口，所以不能直接使用增强for循环来遍历它。

for (元素类型 e : 数组或集合对象) {
        对元素进行操作;
    }
*/


public class ForEachDemo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 5, 3, 1};
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("-----");

        String[] StrArr = {"I", "Love", "You"};
        for (String s : StrArr) {
            System.out.println(s);
        }
        System.out.println("-----");

        List<String> list = new ArrayList<String>();
        list.add("I");
        list.add("Love");
        list.add("You");
        for (String l : list) {
            System.out.println(l);
        }
        System.out.println("-----");
        // ConcurrentModificationException
        // 增强for循环内部是使用迭代器完成的
        for (String l : list) {
            if (l.equals("You")) {
                list.add("Li");
            }
        }
    }
}
