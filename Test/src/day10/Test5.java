package day10;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList
 */
public class Test5 {
    public static void main(String[] args) {
        List<String > list = new ArrayList<String>();
        list.add("b");//索引下标0，和数组一样
        list.add("a");
        list.add("c");
        list.add("d");
        list.add("c"); // 允许使用重复元素
        System.out.println(list.get(2));//按索引的位置访问集合
        System.out.println(list);
        list.add(1,"f"); // 在指定索引下标插入元素
        System.out.println(list);
        List<String> l = new ArrayList<String>();
        l.add("ss");
        l.add("22");
        list.addAll(2,l); // 插入集合

        System.out.println(list.indexOf("d"));// 获取指定元素在集合中第一次出现的下标。
        System.out.println(list.lastIndexOf("d"));// 获取指定元素在集合中最后一次出现的下标。
        list.remove(2);//根据索引下标移除元素
        list.set(1,"ff"); //根据下标修改元素
        l = list.subList(2,4); //根据下标的起始位置截取集合，生成新集合，截取时
        //的时候，包含开始的索引，不包含结束的索引。（2，3）

    }
}
