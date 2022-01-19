package cn.hh.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author admin
 * @Date 2021/12/3 13:14
 * @Version 1.0
 */
class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  boolean equals(Object obj){
        //为了提高效率，如果比较的对象是同一个，直接返回true
        if (this == obj) {
            return true;
        }

//		System.out.println(this + "......" + obj);

        if (!(obj instanceof Person)) {
            throw new ClassCastException("类型错误");
        }
        Person p = (Person)obj;
        return this.name.equals(p.name) && this.age == p.age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

}


public class ArrayListTest3 {
    public static void main(String[] args) {
        /*
         * 练习：1，往ArrayList集合中存储自定义对象。Person(name, age)
         * 思路：
         * 1，描述Person
         * 2，定义容器对象
         * 3，将多个Person对象存储到集合当中
         * 4，取出Person对象
         */

        //1，创建ArrayList集合对象
        List list = new ArrayList();
        //2，添加Person类型的对象
        Person p1 = new Person("lisi1", 21);
        Person p2 = new Person("lisi2", 22);

        list.add(p1);
        list.add(p1);//存储了一个地址相同的对象
        list.add(p2);
        list.add(new Person("lisi3", 23));
        list.add(new Person("lisi1", 21));
        list.add(new Person("lisi2", 22));

        /*
        //3，取出元素
        for (Iterator it = list.iterator(); it.hasNext();) {
            //it.next()：取出的元素都是Object类型的。需要用到具体对象的内容时，需要向下转型。
            Person p = (Person) it.next();
            System.out.println(p.getName() + ":" + p.getAge());
        }
        */

        System.out.println(list);
        singleElement2(list);//去除重复元素
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
