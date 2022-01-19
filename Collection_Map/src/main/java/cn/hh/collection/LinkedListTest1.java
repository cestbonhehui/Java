package cn.hh.collection;

import java.util.LinkedList;

/**
 * @Author admin
 * @Date 2021/12/3 13:26
 * @Version 1.0
 */

/*
 * 描述一个队列数据结构。内部使用的是LinkedList
 */
class MyQueue {
    private LinkedList link;
    MyQueue() {
        link = new LinkedList();
    }

    /**
     * 添加元素的方法
     */
    public void myAdd(Object obj) {
        //内部使用的是LinkedList的方法
        link.addFirst(obj);
    }

    /**
     * 获取队列元素的方法
     */
    public Object myGet() {
        return link.removeLast();
    }

    /**
     * 集合中是否有元素的方法
     */
    public boolean isNull() {
        return link.isEmpty();
    }

}

public class LinkedListTest1 {
    public static void main(String[] args) {
        /*
         * 练习：请通过LinkedList实现一个堆栈或者队列数据结构。
         * 堆栈：先进后出，First In Last Out(FILO)
         * 队列：先进先出，Fisrt In First Out(FIFO)
         */
        //1，创建自定义的队列对象
        MyQueue queue = new MyQueue();

        //2，添加元素
        queue.myAdd("abc1");
        queue.myAdd("abc3");
        queue.myAdd("abc4");
        queue.myAdd("abc5");

        //3，获取所有元素
        while (!queue.isNull()) {
            System.out.println(queue.myGet());
        }

    }
}
