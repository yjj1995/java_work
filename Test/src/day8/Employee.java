package day8;

public abstract class Employee {
    public void Employee()// 无参数构造器，相当于默认
    {

    }
    String name;
    int id;
    int Salary;
    int bonus;

    public abstract void work();
}

class CommonEmployee extends Employee{
    // 不是构造
    public void setCommonEmployeeInfo(int id, String name, int Salary){
        super.id = id;
        super.name = name;
        super.Salary = Salary;
    }
    public void getCommonEmployeeInfo(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(Salary);
    }
    @Override
    public void work() {
        System.out.println("普通员工");
    }
}

class MEmployee extends Employee{
        int bonus;
    public void setEmployeeInfo(int id, String name, int Salary,int bonus){
        super.id = id; // 从父类继承的属性用super
        super.name = name;
        super.Salary = Salary;
        this.bonus = bonus;
    }
    public void getEmployeeInfo(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(Salary);
        System.out.println(this.bonus);
    }
    @Override
    public void work() {
        System.out.println("普通员工");
    }
}
