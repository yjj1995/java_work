package day7;

public class Test {
    /**
     * 给test设置一个形参，但不确定什么类，而实参是个类。
     */
/*    public void test(Object obj) {
    }*/
    public static void main(String args[]){
/*        Test t = new Test();
        Person p = new Person();
        Student st = new Student();
        t.test(p);
        t.test(st);
        p = st; // 引用赋值
        System.out.println(p.equals(st));

// 打印hashCode码
        Object o = new Object();
*//*        Object o1 = new Person();
        Object o2 = new Student();*//*
        System.out.println(o.hashCode());
// 打印对象地址
        System.out.println(p.toString());*/

//        数据类型转换
/*        Student s1 = new Student();
        Person p = s1; //基本转换 子类到父类（将子类）
        Person p1 =  new Person();
        Student s = (Student) p; // 强制类型转换

        // Object是所有的类的最高父类
        String str = "hello";
        Object obj = str;
        System.out.print(obj);*/
//        Object obj = "hello";
/*        Test t = new Test();
        t.method(new Student());*/

// ==
/*        Person p1 = new Person();
        Person p2 = new Person();
        System.out.print(p1==p2); // false
        Person p2 = p1
        System.out.print(p1==p2); // true
        */
/*
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.print(s1 == s2); // false
        System.out.print(s1.equals(s2)); // true
*/
// 拆箱
/*        boolean b = new Boolean("false").booleanValue();
        System.out.print(b);*/

// 自动装箱/自动拆箱
/*        Integer i1 = 112;
//        int i0 = i1;*/
//        int i = Integer.parseInt("123");
//        // 字符串转成整数
//        float f = Float.parseFloat("0.222");
//
//        String instr  = String.valueOf(f); // 转成字符串
//        Single s = new Single(); // 不能new
        Single s = Single.getInstance(); //饿汉式




    }
/*    public void method(Person e){ //
        if(e instanceof Student){
            Student s = (Student) e; // 父类到子类，需要强转
            s.getSchool();
        }else {
            e.test();
        }
    }*/
}
