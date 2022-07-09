package Study;

/**
 * @author Li
 */
public class Day07 {
    public static void main(String[] args) {
        // 一: Debug
        System.out.println("一: Debug");
        // 1. Debug 概述
        // 1.1 Debug: 是供程序员使用的程序调试工具,它可以用于查看程序的执行流程,也可以用于追踪程序执行过程来调试出
        // 1.2 Debug 调试, 又被称为断点调试,断点其实是一个标记,告诉我们从哪里查看
        /* 2. 操作流程
            2.1 如何加断点
            选择要设置断点的代码行,在行号的区域后面单击鼠标左键即可
            2.2 如何运行加了断点的程序
            在代码区域右键 Debug 运行
            2.3 看哪里
            看 Debug 窗口
            看 Console 窗口
            2.4 点哪里
            点 Step Into(F7)这个箭头, 也可以直接F7
            点 Stop 结束
            2.5 如何删除断点
            选择要删除的断点, 单击鼠标左键即可
         */
        int i = 10;
        int j = 20;
        int sum = i + j;
        System.out.println("sum: " + sum);
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= i; j++) {
                sum = i * j;
                System.out.print("i * j = " + sum + " ");
            }
            System.out.println();
        }
        int num = 100;
        System.out.println("调用 change 方法前:" + num);
        change(num);
        System.out.println("调用 change 方法后:" + num);
    }
    public static void change(int number){
        number = 200;
    }
}
