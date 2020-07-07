package day8;

public class Test2 {
    public static void main(String[] args){
        // 开发人员B
        BWM b3 = new BWM3Factory().productBMW();
        BWM b5 = new BWM5Factory().productBMW();
        BWM b7 = new BWM7Factory().productBMW();
        b3.showInfo();
    }
}
