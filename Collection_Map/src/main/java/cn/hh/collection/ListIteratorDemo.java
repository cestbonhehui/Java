package cn.hh.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author admin
 * @Date 2021/12/3 13:00
 * @Version 1.0
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");

        /*
        //希望在遍历的过程中，如何遍历到"abc2"，添加一个元素"haha"
        for (Iterator it = list.iterator(); it.hasNext();) {
            Object obj = it.next();
            if (obj.equals("abc2")) {
                list.add("haha");//java.util.ConcurrentModificationException，
                                 //迭代过程中，使用了集合对象同时对元素进行操作，导致了迭代的不确定性。引发了该异常。
                                 //解决思想：在迭代过程中，想要执行一些操作，使用迭代器的方法就可以了。
            }
            System.out.println(obj);
        }
        */
        //使用List集合的特有迭代器ListIterator来实现，通过List集合的方法listIterator()方法获取该迭代器对象。
        //ListIterator接口可以实现在迭代过程中的增删改查。
        for (ListIterator it = list.listIterator(); it.hasNext();) {
            Object obj = it.next();

            if (obj.equals("abc2")) {
                it.add("haha");
            }

        }
        System.out.println(list);
    }
}
