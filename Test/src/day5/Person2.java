package day5;

public class Person2 {
/*    public Person2(){ // 如果显式的定义了构造方法，则不会调用默认的。
        age = 1;
        name = "sss";
    }*/
    public Person2(int a, String n){
        age = a;
        name = n;
    }

    public int age;
    public String name;
    public void showIo(){
        System.out.print(age);
        System.out.print(name);

    }
}
