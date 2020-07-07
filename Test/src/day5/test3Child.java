package day5;
import day5.test3;

/**
 * 通过extends可以构成父子类的关系
 * test3Child是test3的子类
 */

public class test3Child extends test3{
    public void test(){
        System.out.print(age);
        setAge();
    }
}
