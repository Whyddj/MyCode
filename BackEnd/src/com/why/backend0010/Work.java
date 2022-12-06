package com.why.backend0010;

public class Work {
    public static void main(String[] args){
        Employee employee = new Employee(4000,202209);
        Manager manager = new Manager(50, "张三",90,13000.23,200109,new Bike());

        employee.play();
        employee.sing();

        manager.work();
        manager.play();

    }
}
