package day6;
public class Student extends Person{
    String school;
    @Override
    public void showInfo(){
        System.out.print(this.school);
        System.out.print(this.age);
        System.out.print(this.name);
        System.out.print(this.sex);
    }

    @Override
    public void setInfo(int age, String name, int sex) {
//        super.setInfo(age, name, sex);
        System.out.print(age);
        System.out.print(name);
        System.out.print(sex);
    }

    public static void main(String[] args){
        Student stu = new Student();
        stu.showInfo(); // 子类有，就调用子类，没有就父类。

        Person e = new Student(); // 父类的引用对象可以指向子类实例
        Person p = new Person();
        p = new Student();
    }
}
