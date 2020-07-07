package day4;

public class Test2 {
    public static void main(String[] args){
        // 实例化person类，也就是创建person对象
        // int i = 0;
        // String s = "";
/*        personClass person1 = new personClass(); // 声明一个person类型的变量，变量名person1 实例化person类并且给person 赋值。
        // new personClass() 就是实例化penson类
        person1.name = "张三"; // 给person 对象的name属性赋值。
        person1.walk(); // 调用对象的方法， 有返回值的方法，在调用之后就会有一个值，这个值就是方法中return的那部分。*/
/*  // 实例化Animal 的对象
        Animal animal = new Animal();
        animal.eat("老鼠");
        animal.move("飞");
// 对象对象的使用就是操作对象的变量，调用类的方法。
        person p = new person();
        System.out.print(person.sex); // 类变量可以被类名调用,也可以由对象调用*/

/*        person p1 = new person();
        person p2 = new person();
//       类一个，可以实例化多个对象。*/
/*        Student st = new Student();
        st.name = "小明";
        st.age  = 12;
        st.course = "语文，数学";
        st.interst = "打球";
        st.showInfo();*/
/*
        Test2 t2 = new Test2();
        int x;
        x = t2.getArea(3,2);
        System.out.print(x);*/
/*        personDemo p1 = new personDemo();
        p1.study();
        p1.age = 10;
        p1.showAge();
        p1.addAge(10);
        System.out.print(p1.age);*/
/*        Circle circle = new Circle();
        System.out.print(circle.area(2));*/
    }
/*    public int getArea(int a, int b){
        return a*b;
    }*/

    /**
     * 重载 参数的个数或参数的类型（顺序）不同
     ** 同名方法的重载
     */
    public int add(int x, int y){
        return x+y;
    }
    public double add(int x, double y){
        return x+y;
    }
    public int add(int x, int y, int z){
        return x+y+z;
    }
}
