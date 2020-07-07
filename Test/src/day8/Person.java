package day8;

public class Person {
    // 在new Person的时候，类的属性的默认化和显式初始化 执行代码块（从上到下） 执行构造器的代码
    static int age;
    static TestPerson tp = new TestPerson();
    String name;
    public Person(){
        this.name = "张三";
        System.out.println("执行的是构造方法");
    }
    {
//        非静态代码块
        System.out.println("执行的是非静态代码块");
    }
    static {// 静态代码块
        // 这里只能使用静态static修饰的属性和方法
        age = 1;
        showAge();
        System.out.println("执行的是非静态代码块方法");
    }
    public static void showAge(){
        System.out.println(age);
    }
    public  void showAge1(){
        System.out.println(age);
    }
}
