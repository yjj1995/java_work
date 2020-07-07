package day8;

import java.io.File;

public abstract class Animal {
    public abstract void test(); //以分号结束
    public abstract void move();
}

class Dog extends Animal{
    @Override
    public void test() {

    }
    @Override
    public void move() {
        System.out.println("狗的移动方式是跑");

    }

}
abstract class Cat extends Animal{ // 有一个抽象方法没有重写，则子类也需要被定义为抽象类
/*    @Override
    public void test() {

    }*/
    @Override
    public void move() {
        System.out.println("狗的移动方式是跑");

    }

}
class Fish extends Animal{
    @Override
    public void test() {

    }
    @Override
    public void move() {
        System.out.println("🐟的移动方式是游");

    }
    public static void main(String[] args){
        new Fish().move();
        new Dog().move();
    }

}
