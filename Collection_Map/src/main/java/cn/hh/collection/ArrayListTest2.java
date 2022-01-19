package cn.hh.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author admin
 * @Date 2021/12/3 13:14
 * @Version 1.0
 */
public class ArrayListTest2 {
    public static void main(String[] args) {
        /*
         * 练习1，定义功能，请去除ArrayList集合中的重复元素。
         */

        List list = new ArrayList();

        list.add("abc1");
        list.add("abc4");
        list.add("abc2");
        list.add("abc1");
        list.add("abc4");
        list.add("abc4");
        list.add("abc2");
        list.add("abc1");
        list.add("abc4");
        list.add("abc2");

        System.out.println(list);
        singleElement2(list);
        System.out.println(list);
    }

    /**
     * 去除重复元素方式二。
     * 思路：
     * 1，最后唯一性的元素，可以先定义一个容器用于存储这些唯一性的元素。
     * 2，对原有的容器进行元素的获取，并到临时容器中去判断是否存在，容器本身就有这个功能，判断元素是否存在
     * 3，存在就不存储，不存在就存储。
     * 4，遍历完原容器后，临时容器中存储的就是唯一性的元素了。
     */
    public static void singleElement2(List list) {
        //1，定义一个临时容器
        List temp = new ArrayList();

        //2，遍历原容器
        for (Iterator it = list.iterator(); it.hasNext();) {
            Object obj = (Object) it.next();

            //3，在临时容器中判断遍历到的元素是否存在
            if (!temp.contains(obj)) {
                //4，如果不存在，就存储到临时容器中
                temp.add(obj);
            }

        }

        //5，将原容器清空
        list.clear();
        //6，将临时容器中的元素都存储到原容器当中
        list.addAll(temp);
    }
}
