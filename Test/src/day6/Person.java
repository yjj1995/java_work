package day6;

/**
 * 人{
 * 姓名 性别 年龄
 * 打印类的方法
 * }
 */
public class Person {
    public String name;
    public int sex;
    public int age;
    public void showInfo(){
        System.out.println(this.sex);
        System.out.println(this.age);
        System.out.println(this.name);
    }
    public void setInfo(int age, String name, int sex){
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
}
