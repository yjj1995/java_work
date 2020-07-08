package day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
//        Set set = new HashSet();
        Set<Object> set = new HashSet<Object>(); // 和上面一样
/*        set.add(1);
        set.add("a");
        System.out.println(set);
        set.remove(1);
        System.out.println(set);
        System.out.println(set.contains("a"));
        set.clear();
        System.out.println(set);*/
        // 集合遍历
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());// 迭代输出
        }
        for(Object obj:set){//推荐这种
            System.out.println(obj);
        } // 这个的意思时把set的每一个值取出来，赋值给obj, 知道循环set的所有值
        System.out.println(set.size());//元素个数
        set.add("d"); // 不可重复存入
        // 如果想要集合只能存同样类型的对象，怎么做
        // 使用泛型
        Set<String> set1 = new HashSet<String>(); // 不能存String之外的类型
//        set1.add(1);// 不能存数字
    }
}
