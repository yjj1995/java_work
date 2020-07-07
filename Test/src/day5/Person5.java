package day5;

/**
 * 一个javaBean
 * 私有的属性
 * 属性对应的get和set方法
 * 可以自动生成get和set方法
 */
public class Person5 {
    private String name;
    private int sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
/*    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setSex(int sex){
        this.sex = sex;
    }
    public int getSex(){
        return this.sex;
    }
    public void setAge(int age){
        this.age =age;
    }
    public int getAge(){
        return this.age;
    }*/

}
