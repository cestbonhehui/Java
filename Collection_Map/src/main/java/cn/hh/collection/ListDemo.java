package cn.hh.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author admin
 * @Date 2021/12/3 12:52
 * @Version 1.0
 */
public class ListDemo {
    public static void main(String[] args) {
        List list=new ArrayList();

        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");

        for(Iterator it = list.iterator();it.hasNext();){

        }
    }
}
