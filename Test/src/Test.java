/**
 * 文档注释
 * @author
 * @varsion 1.0.0
 * */
public class Test {
    public static void main(String[] args) {
//        打印hello world
//        System.out.println("hello world!");
//        /*
//         * 多行注释
//         * 下面写一个打印adc的代码
//         *  */
//        System.out.println("abc");
//        int i = 0;
//        i = 1;
//        System.out.println(i);
////        变量给变量赋值
//        int k = 10;
//        i = k;
//        short s = 9;
//        short s0 = 11;
//        s0 = s ;
//        System.out.println(s0);
////      小容量可以转成大容量
//        byte b = 1;
//        int m = b;
//        System.out.println(m);
        // 以上属于隐式转化
//   大容量不能转成小容量
//        int m1= 1;
//        byte b1 = m1;
//        int i = 1;
//        short a = 2;
//        byte b = 3 ;
//        String arg = "abc";
//        int i = 1;
//        System.out.println(arg+1);
//        String str = "1" + 1 + 2 + 3;
//        System.out.println(str);//用双引号括起来的都是字符串
//        把任何基本类型的值和字符串值进行连接运算的时候,基本类型的值将自动转化为字符串类型.
//        System.out.println(3+4+"hello");
//        // 输出7hello
//        System.out.println("hello"+3+4);
//        // 输出hello34
//        // 分开计算
//        // 字符串+任何东西都是字符串
//        System.out.println('a'+1+"hello");
//        // 输出98hello 'a' 与 1相加的时候，做的是加法，ascii码
//        System.out.println("hello"+'a'+1);
//        //输出helloa1
//        // 注意：当有一系列的+运算的时候，如果其中某个部分含有字符串，那么这个字符串后面的加号都是
//        // 字符串拼接
//        // 强制类型
//        int k = 7;
//        byte b0 = (byte)k;// 强制转化数据类型，转化的数据类型要用英文的小括号括起来。
//        // 针对基本数据类型
//        int i = 1 ;
//        short s = 2;
//        i = s;
//        System.out.println(i);
//        // 强制类型转换
//        s = (short) i;
//        // 连续赋值
//        int i0,i1,i2;
//        i0 = i1 =i2 =1 ;
//        System.out.println(i0+","+i1+","+i2);
////        i = i + 2;
//        i+=2;
//        System.out.println(i);
//        i-=2;
//        System.out.println(i);
//        short s1 = 2;
        //s1 = short（s1+3）;//变量参与运算时候，java程序不知道具体的这个变量在做完运算后，会不会
        //超出当前变量的范围，所以会把变量转换成一个更大长度。
        // 这个例子中short 是一个短整型数据，会转换为默认的int。
//        s1 +=3 ;
        // 在使用扩展运算符的时候，变量在参与运算时会把结果强**制转换为当前变量的类型**，

        // 三目运算符
//        int m = 1;
//        int n = 2;
//        System.out.println(m > n ? m : n);
//
//        int  k = 0;
//        // 运算符嵌套
////        System.out.println(m>n?(m>k?m:k):(n>k?n:k));
//        //
//        System.out.println(2*(3%2));

//        1, 顺序结果
//        2， 分支结构
   /*     int score = 40;
        if (score == 100) {
            System.out.println("奖励");
        } else if(score>80&&score<=90){
            System.out.println("5s");
        } else if(score>60&&score<=80){
            System.out.println("XXX");
        }else {
            System.out.println("X");
        }*/
//        3.switch
/*        char c = 'a';
        switch (c){
            case 'a':
                System.out.println('A');
                break;
            default:
                System.out,person('B');
        }*/
/*        for (int i = 0; i<5;++i)
        {
            System.out.println(i);
        }*/
//        demo 乘法表
/*        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"X"+j+"="+(i*j)+" ");
            }
            System.out.println("");
        }*/
  /*      int [][] arr = new int[][]{
                {1,2,3},
                {2,2,3}
        };
        int len = arr.length;
        for (int i=0;i<len;i++){
            int[] arr0 = arr[i]; // 得到一维数组
            int llen = arr0.length;
            for(int j=0;j<llen;j++){
                System.out.println(arr0[j]);
            }
        }*/
//        冒泡排序
//        1. 一轮一轮的进行排序
//        例： arr = {2,1,3,5,4,7}
/*        int[] arr = new int[]{2, 443,32, 44, 4, 7};
        int len = arr.length;
        int temp = 0;
        for (int i = 0; i < len - 1; i++) { // 循环的轮次 = len -1
            for (int j = 0; j < len - 1 - i; j++) {*/
//                   temp = arr[j+1];
/*                   arr[j + 1] = (arr[j] > arr[j + 1]) ? arr[j] : arr[j + 1];
                   arr[j] = arr[j]>temp?temp:arr[j];*/
// 三目运输符
/*                  if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int k = 0; k < len; k++){
            System.out.print(arr[k]+" ");
            }
    }*/


    }
}
//   数组
    /*    int [] ii= new int[4];
        System.out.println(ii[0]);*/


//    }

