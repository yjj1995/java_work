package day7;

/**
 * 饿汉式
 *
 */
public class Single {

    // 私有构造,调用这个类，不能直接使用new来创建对象
    private Single(){

    }
    // 私有的single类型的类变量
    private static Single single = new Single();
    public static Single getInstance(){
        return single;
    }
}
