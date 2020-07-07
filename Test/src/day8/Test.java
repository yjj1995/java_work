package day8;

public class Test {
    public static void main(String[] args){
/*        new Person(); // 在程序的运行过程中，非静态代码块每次new对象的时候都需要重新执行，静态只执行一次
        Person p = new Person(){
            // 想把名字变成李四用代码块初始化
            {
//            也可以  name = "李四";
//            this.name = "李四";
//                super.name = "李四";
                super.name = "李四";
            }
            @Override // 重写Person的方法
            public void showAge1() {
                System.out.println("=========");
            }
        }; // 构建了一个没有类名的Person的子类，也就是匿名的Person的子类,没有类目就不能显式的new的方法创建对象，如果要是
        //还有在构造器中初始化属性就没办法了，这种就要有代码块。


        System.out.println(p.name);*/
/*        CommonEmployee ce = new CommonEmployee();
        ce.work();
        ce.setCommonEmployeeInfo(123,"ss",22222);
        ce.getCommonEmployeeInfo();*/
        TestTm tm = new TestTm();
        tm.getTime();
    }
}
