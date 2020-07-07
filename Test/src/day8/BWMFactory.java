package day8;

/**
 * 汽车生成接口
 */
public interface BWMFactory {
    BWM productBMW();
}
class BWM3Factory implements BWMFactory{

    @Override // 去掉接口继承也没有问题，加上接口使得更规范
    public BWM productBMW() {
        System.out.println("产生3系");
        System.out.println("修改3系");
        return new BWM31();// 返回三系对象
    }
}
class BWM5Factory implements BWMFactory{

    @Override
    public BWM productBMW() {
        System.out.println("5系");
        return new BWM5();
    }
}
class BWM7Factory implements BWMFactory{

    @Override
    public BWM productBMW() {
        System.out.println("7系");
        return new BWM7();
    }
}
