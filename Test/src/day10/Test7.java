package day10;

import java.util.*;

public class Test7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("d");
        list.add("d");
        System.out.println(list);
        Collections.reverse(list);//反转
        System.out.println(list);
        Collections.shuffle(list);//随机排序
        System.out.println(list);
        Collections.sort(list); // 字典升序排序
        System.out.println(list);
        System.out.println(Collections.frequency(list,"a"));// 统计a出现的次数
        Collections.replaceAll(list,"a","b"); // 把a替换成b

        /*Student st1 = new Student(12,"ss2s");
        Student st2 = new Student(3,"sss3");
        Student st3 = new Student(44,"ss4s");
        Student st4 = new Student(33,"s7ss");
        List<Student> stus =  new ArrayList<Student>();
        stus.add(st1);
        stus.add(st2);
        stus.add(st3);
        stus.add(st4);
        Collections.sort(stus,new Student());
        for(Student stu:stus){
            System.out.println(stu);
        }
        Collections.swap(stus,0,1); // 交换元素位置
//        Collections.max(list); // 集合最大
//        Collections.min(list); // 集合最小
        Student  s = Collections.max(stus,new Student());//返回最大student 按age排序, 比较*/
    }
}

class Student implements Comparator<Student>{
    int age;
    String name;
    public Student(){
    }
    public Student(int age,String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public int compare(Student o, Student t1) {//按age 比较大小, 自定义规则
        if (o.age > t1.age) {
            return 1;
        } else if (o.age < t1.age) {
            return -1;
        } else {
            return 0;
        }
    }
}
