package day4;

import java.util.SplittableRandom;

public class person3 {
//    /*
//    用数组的方式来传递可变个数的参数
//    */
    public void printInfo(String[] args){ // 问题，我们能够打印的信息都有来源于方法的参数也就是形参的
        //的传递，我现在可能给方法要传递的不同的参数？每次传递都不一样。
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);

        }
    }
    /*
    * 用java特有的... 的方式来传递可变个数的参数，这种参数在使用时与数组的使用方式相同。
    * */
    public void printInfo1(String... args){
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);

        }

    }

}
