/**
 * 动物的类
 * @author yjj
 */
public class Animal {
    String name;
    int eye;
    int legs;

    /**
     *  输出动物吃的食物
     * @param food
     */
    public void eat(String food){
        System.out.println("此种动物的食物是：" + food);
    }

    /**
     * 动物的移动方式
     * @param moveType
     */
    public void move(String moveType){
        System.out.println("此种动物的移动方式是："+ moveType);

    }
}
