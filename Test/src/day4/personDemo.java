package day4;

public class personDemo {
    public String name;
    public int age;
    public int sex;

    /**
     * 个人信息
     */
    public void study(){
        System.out.println("Studing");
    }
    public void showAge(){
        System.out.println(age);
    }
    public int addAge(int i){
        age = age + i;
        return age;
    }
}
