package day10;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test4 {
    public static void main(String[] args) {
     /*   Set<Integer> set = new TreeSet<Integer>();
        set.add(5);
        set.add(4);
        set.add(1);
        set.add(3);
        System.out.println(set);
        set.remove(5);
        set.contains(3);
//        set.clear();
        System.out.println(set);
        for(Object obj: set){
            System.out.println(obj);
        }*/
        Person P1 = new Person("zzs",23);
        Person P2 = new Person("ss",26);
        Person P3 = new Person("zsss",25);
        Set<Person> set = new TreeSet<Person>(new Person());// TreeSet类型添加Person元素
        set.add(P1);
        set.add(P2);
        set.add(P3);
        for(Person p:set){
            System.out.println(p.age);
        }

    }
}
class Person implements Comparator<Person> { // 把person对象存到TreeSet中并且按照年龄排序
    int age;
    String name;
    public Person(){}
    public Person(String name, int age)
    {
        this.name=name;
        this.age = age;
    }
    @Override
    public int compare(Person p1, Person p2) {//年龄正序排序，实现排序接口
        if(p1.age>p2.age){
            return 1;
        }else if (p1.age<p2.age){
            return -1;
        }else {
            return 0;
        }
    }

}
