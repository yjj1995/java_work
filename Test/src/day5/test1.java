package day5;
import day4.person3;
public class test1 {
//    public int age;  // 这种情况，把类的属性开放出来，让调用者随意使用，这样会有问题。
    // 我们需要对这样不能让调用者随意使用的属性做封装和隐藏。
    private int age;
    public void printAge(){
        System.out.print(age);
    }
    public void setAge(int a){
        if(a<=150&&a>=0){
            age = a;
        }else {
            System.out.print("不合适");
        }
    }
    public int getAge(){
        return age;
    }
}
