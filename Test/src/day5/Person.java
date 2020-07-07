package day5;

public class Person {
//    默认的构造方法前面有没有访问的修饰符和定义的类有关，类是public，构造方法就是public。
    public Person(){}

    private int age;

    public void setAge(int i) {
        age = i;
    }
    public int getAge(){
        return age;
    }
}

class T0{
//    默认的构造方法
    T0(){}
}
