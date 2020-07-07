package day8;

/**
 * 宝马车的产品接口
 */
public interface BWM {
    //产品信息
    void showInfo();
}
class BWM31 implements BWM
{

    @Override
    public void showInfo() {
        System.out.println("这是3系");
    }
}
class BWM5 implements BWM
{

    @Override
    public void showInfo() {
        System.out.println("这是5系");
    }
}
class BWM7 implements BWM
{

    @Override
    public void showInfo() {
        System.out.println("这是7系");

    }
}