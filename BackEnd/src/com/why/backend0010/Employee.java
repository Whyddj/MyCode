package com.why.backend0010;

public class Employee extends Role {
    private double salary;
    private static int ID;

    public Employee(int age, String name, double weight, double salary, int ID) {
        super(age, name, weight); // 调用直接父类构造函数。
        this.salary = salary;
        Employee.ID = ID;
    }

    public Employee(double salary, int ID) {
        this(18, "王五", 73.5, salary, ID);
    }

    @Override
    public void play() {
        System.out.println(getName() + "摸鱼ing");
    }

    @Override
    public void replay() {
        super.replay(); // 用来调用直接父类方法,(虽然这里显得多余
    }

    public final void sing() {
        System.out.println(getName() + "singing");
    }


}
