package Study.Day45;

/**
 * @author Li
 */
public class GenericInterfaceDemo<T> implements GenericInterface<T> {
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
