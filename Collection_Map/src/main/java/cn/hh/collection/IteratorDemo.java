package cn.hh.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Author admin
 * @Date 2021/12/3 12:20
 * @Version 1.0
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> c = new LinkedList<>();
        ArrayList<String> arr = new ArrayList<>();

        c.add("a");
        c.add("b");
        c.add("c");

        /**因为Collection中有iterator方法，
         所以每一个子类集合对象都具备迭代器**/
        Iterator<String> it = c.iterator();
        Iterator<String> arrIt = arr.iterator();

        //判断集合是否为空
        System.out.println(c.isEmpty());

        //增强for循环
        for(String s:c){
            System.out.println(s);
        }

        //判断当前位置是否有元素可以被取出
        while (it.hasNext()) {
            //获取当前位置的元素，将迭代器对象移向下一个索引位置
            System.out.println(it.next());
        }

        //当前索引为空了
        System.out.println(it.hasNext());

        while (it.hasNext()){
            String s= it.next();
            if("b".equals(s)){
                System.out.println(s);
                //迭代器的删除方法
                it.remove();
            }
        }




    }
}
