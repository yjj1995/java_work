package day8;
/*
子类继承父类只能一个，子类可以实现多个接口
如果类没有实现接口的方法，则要定义为抽象类
 */

public class Testindemo implements TestIn,testIn1{
    @Override
    public void test(){
    //1
    }


    @Override
    public void test1() {
        //2
    }
}
