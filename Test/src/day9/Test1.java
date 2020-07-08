package day9;

public class Test1 {
    public static void main(String[] args){
        // 可以在main方法抛出异常，main方法抛出异常，
        //直接抛到虚拟机上去了，就在程序中不能处理。
        B b = new B();
        try {
            b.test();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
class B{
    int i;
    //  NullPointerException
    public void test() throws NullPointerException{// 可以使用throws在代码
        //这抛出异常，在调用方式去捕获处理。
        /*B b = null;
        System.out.println(b.i);
        */
        B b = new B();
        try {
            b.test1(-100);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    int age;
    public void test1(int age) throws Exception {
        if(age>=0&&age<150){
            this.age = age;
            System.out.println("年龄是:"+this.age);
        }else {// 自定义异常
            throw new Exception("年龄超出范围");
        }
    }
}
class C extends B{
    @Override
    public void test() throws NullPointerException
//    public void test() throws Exception
    {
        super.test();
    }
}
