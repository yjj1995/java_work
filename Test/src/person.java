import java.util.SplittableRandom;
public class person {
//    int i; 这样写不对
//    public static void main(String args[]){
/*
//        System.out.println("   *                   *  ");
//        System.out.println("*    *    a b c     *    *");
//        输出数据类型
        byte b = 1;
        System.out.println(b);
        int i = 1;
        System.out.println(i);
        short s = 2;
        System.out.println(s);
        long l = 39l;
        System.out.println(l);
        // 浮点
        float f = 1.22f;
        System.out.println(f);
        double d = 123;
        System.out.println(d);
        // 字符
        char c = 'c';
        char e = '1';
        System.out.println(c);
        System.out.println(e);
        // 布尔
        boolean b1 = false;
        System.out.println(b1);
*/
//    }
    public String name = "zs";
    private int age; // private私有的， 可以在本类的方法使用，不能
    // 修饰变量可以修饰变量，私有的不能由对象.属性调用。
    // 实例变量 需要实例化成对象之后才能使用。
    public static String sex = "男"; //static 意思是静态的，不需要类实例化成对象就可以使用。 类变量
    public void showAge() {
        System.out.print(age);
    }
}
