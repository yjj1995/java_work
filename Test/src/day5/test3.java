package day5;

public class test3 {
/*    private int age;
    private void getAge(){ // 只能在本类内部
        System.out.print(age);
    }
    public void setAge(){
        getAge(); //
        System.out.print(age);
    }*/
// 缺省 同包 同类可以，子类不行（不在同一个包）
/*    int age;
    void setAge(){
        age = age+1;
    }*/
// protected
    protected int age;
    protected void setAge(){
        age = age+1;
    }
}
