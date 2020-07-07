package day5;

public class TestPerson {
    public static void main(String[] args) {
/*        Person p = new Person();
        // new的时候，就是调用了构造方法
        int age = p.getAge();
        System.out.print(age);*/
// 需求，希望在new对象的时候能够自己给属性不同的值
        /**
         * 可以写带参数的对象
         */
/*        Person2 p2 = new Person2(12,"yjj");
        p2.showIo();*/
        Person5 p5 = new Person5();
        p5.setAge(12);
        p5.setName("22");
        p5.setSex(1);
        System.out.print(p5.getAge());
        System.out.print(p5.getName());
        System.out.print(p5.getSex());
    }
}
