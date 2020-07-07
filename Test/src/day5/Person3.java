package day5;

public class Person3 {
    public Person3(int a, String n){
        age = a;
        name = n;
    }

    /**
     * // 构造函数重载， 为了方便调用不同需要的对象。
     * @param n
     */
    public Person3(String n){
        name = n;
    }
    public Person3(){
    }
    public int age;
    public String name;
}
