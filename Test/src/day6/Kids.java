package day6;

public class Kids extends ManKind {
    public Kids(){
//        super(20,20);  // 当父类只有有参构造可以使用的时候，子类必须显式的构建一个构造来调用父类的有参构造，并需要写在第一行。
        this.yearsOld = 10;
        this.sex=sex;
        this.salary=salary;
        System.out.print("子类构造器" + yearsOld);

    }
    public int yearsOld;
    public static void main(String[] args){
        Kids somekids = new Kids();  // 构造方法在new 的时候执行。
/*        somekids.salary = 100;
        somekids.sex = 1;
        somekids.yearsOld = 20;
        somekids.employeed();
        somekids.manOrWorman();
        somekids.printAge();*/
    }
    public void printAge(){
        System.out.print(this.yearsOld);
    }
}
