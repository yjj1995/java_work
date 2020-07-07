package day5;

public class Person4 {
    public Person4(int age, String name){
        this(1);//this当作类来调用
        this.age = age; // 后面为形参
        this.name =name;
    }
    public Person4(int age){
        this.age = age; // 后面为形参
    }
    int age;
    String name;
    public void setName(String name){
        this.name = name;
    }
    public void setName1(String name){
        this.setName(name);
    }

    public void showInfo(){
        System.out.print("年纪"+this.age);
        System.out.print("姓名"+this.name);
    }
}
