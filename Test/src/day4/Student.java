package day4;

public class Student {
    public String name;
    public int age;
    public String course;
    public String interst;

    /**
     * 显示学生的个人信息
     */
    public void showInfo(){
        System.out.print("姓名: "+name); // ctrl + D 复制一行
        System.out.print("年龄: "+age); // ctrl + D 复制一行
        System.out.print("课程: "+course); // ctrl + D 复制一行
        System.out.print("兴趣: "+interst); // ctrl + D 复制一行
    }
}
