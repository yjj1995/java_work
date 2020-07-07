package day8;

public class test3 {
    int i;
    private int b;
    public int c;
    class A{
        int i;
        public void setT3F(){
            test3.this.i=1;
        }
        public void set(){
            this.i=10;
        }
    } //内部类
    public void setInfo(){
        new A().setT3F();//外部类使用内部类
    }
    public void showInfo(){
        System.out.println(this.i);
    }
    public static void main(String[] args){
        test3 t3 = new test3();
        t3.setInfo();
        t3.showInfo();
    }
}
