package Study.Day29;

/**
 * @author Li
 */
public class InterImplements implements Inter{
    @Override
    public void show() {
        System.out.println("show方法执行了");
    }

    @Override
    public void method() {
    }

    /** 间接继承 Object(超类)
     *  public class InterImplements implements Inter 等价于:
     *  public class InterImplements extend Object implements Inter
     * */
    public InterImplements() {
        super();
    }
}
