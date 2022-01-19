package cn.hh.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author admin
 * @Date 2021/12/3 13:12
 * @Version 1.0
 */
public class ArrayListTest1 {
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
        singleElement(list);
        System.out.println(list);
    }

    /**
     * 定义功能。去除重复元素
     */
    public static void singleElement(List list) {
        //选择排序
        for (int x = 0; x < list.size() - 1; x++) {
            Object obj_x = list.get(x);
            for (int y = x + 1; y < list.size(); y++) {
                if (obj_x.equals(list.get(y))) {
                    list.remove(y);
                    y--;
                }
            }
        }
    }
}
