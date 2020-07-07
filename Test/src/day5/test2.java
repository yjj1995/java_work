package day5;

public class test2 {
    public static void main(String[] args){
        test1 t = new test1(); // 如果使用同一个包下的类，import可以省略。
//        t.age = -100; // 这样的情况，程序是对的，能执行，但是不符合正常逻辑。
        // 这种情况，把类的属性开放出来，让调用者随意使用，这样会有问题。
/*        t.setAge(12);
        t.printAge();*/
        test3 t3 = new test3();
        // 缺省的在类内部，同一个包
        t3.age = 1;
        t3.setAge();

    }
}
