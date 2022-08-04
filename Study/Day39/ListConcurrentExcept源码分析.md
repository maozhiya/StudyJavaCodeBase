# 并发修改异常的源码分析
## public class ConcurrentModificationException extends RuntimeException

    ConcurrentModificationException:
        java.lang.Object
            java.lang.Throwable
                java.lang.Exception
                    java.lang.RuntimeException
                        java.util.ConcurrentModificationException
### 此异常可能会被抛出的方法，已检测到的对象的并发修改时，这样的修改是不允许的。 
##### 例如，它通常是不允许一个线程而另一个线程遍历它修改集合。
##### 在一般情况下，迭代的结果是不确定的，在这种情况下。
##### 一些迭代器实现（包括所有通用收集实现的JRE提供）可以选择如果检测行为抛出该异常。迭代器这样做被称为快速失败迭代器，因为他们不能迅速、干净，而冒着任意的，非在将来一个不确定的时间确定的行为。

### 注意，这个例外并不总是表明对象已由一个不同的线程的并发性。
### 如果一个线程问题序列的方法调用，违反合同的对象，对象可能抛出该异常。
### 例如，如果一个线程修改直接收集的则是在一个快速失败迭代器集合的迭代，迭代器将抛出此异常。

### 注意，快速失败行为不能得到保证的话，一般来说，不可能在不同步的并发修改的存在作出难以保证。
### 快速失败的操作把ConcurrentModificationException尽最大努力的基础上。
### 因此，要写一个程序，依靠这一例外的正确性错误：ConcurrentModificationException只能用来检测错误。
 
    public interface List<E> extends Collection<E> {
        Iterator<E> iterator();
        boolean add(E e);
    }
######
    public class ArrayList<E> extends AbstractList<E>implements List<E>
    {
        public boolean add(E e) {
            ensureCapacityInternal(size + 1);  // Increments modCount!!
            elementData[size++] = e;
            return true;
        }
        
        public Iterator<E> iterator() {
                return new Itr();
            }
            
        private class Itr implements Iterator<E> {
            int cursor;       // index of next element to return
            int lastRet = -1; // index of last element returned; -1 if no such
            int expectedModCount = modCount;
            /* 
                modCount: 实际修改集合的次数
                expectedModCount: 预期修改集合的次数     
            
                private transient int modCount = 0;
            */
    
            Itr() {}
        
            public boolean hasNext() {
                return cursor != size;
            }
        
            @SuppressWarnings("unchecked")
            public E next() {
                checkForComodification();
                int i = cursor;
                if (i >= size)
                    throw new NoSuchElementException();
                Object[] elementData = ArrayList.this.elementData;
                if (i >= elementData.length)
                    throw new ConcurrentModificationException();
                cursor = i + 1;
                return (E) elementData[lastRet = i];
            }
    
        final void checkForComodification() {
                if (modCount != expectedModCount)
                    throw new ConcurrentModificationException();
            }
        }
    }

