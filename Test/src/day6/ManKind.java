package day6;

public class ManKind {
/*    public ManKind(){
        System.out.print("Mankind");
    }*/// 当存在显式的构造方法时，类就没有默认的无参构造（不写出来），而是要使用显式的)。
/*    public ManKind(int sex, int salary){
//        System.out.print("父类类构造器");
    }*/
    int sex;
    int salary;
    public void manOrWorman(){
        if(this.sex == 0){
            System.out.print("women");
        }else {
            System.out.print("man");
        }
    }
    public void employeed(){
        if(this.salary == 0){
            System.out.print("no job");
        }else {
            System.out.print("job");
        }
    }
}
