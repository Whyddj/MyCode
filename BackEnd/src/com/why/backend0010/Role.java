package com.why.backend0010;

public abstract class Role {
    private int age;
    private String name;
    private double weight;

    public Role(){
        this(18,"王五", 73.5); // 调用当前类的构造函数。
    }

    public Role(int age, double weight){
        this(age, "王五", weight);
    }

    public Role(int age, String name, double weight) {
        this.age = age;   // 引用当前类的实例变量。
        this.name = name;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract void play();

    public void replay(){
        this.play(); // 调用当前类方法(隐式)。
    }

    public Role getRole(){
        return this; // 从方法返回当前类的实例。
    }
}
