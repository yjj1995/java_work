/**
 * @author yjj
 */
public class personClass {
//    属性： 成员变量。 类的成员变量可以先声明，不用初始化，类成员变量是默认值。
    String name; // String 的默认值为null
    int age; // 默认值为0
    boolean isMarried;

    public void walk() { // 驼峰规则
        System.out.print("sss");
    }

    /**
     * 打印姓名
     */

    public String display() { // 如果有一个返回值的方法，那么方法体的最后一行一定是返回相应的数据，使用return。
        return "名字是" + name + ", 年龄是" + age + ", Married:" + isMarried;
    }
}
