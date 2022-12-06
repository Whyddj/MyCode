package com.why.backend0010;

public class Manager extends Employee {
    private final Vehicle vehicle;

    public Manager(int age, String name, double weight, double salary, int ID, Vehicle vehicle) {
        super(age, name, weight, salary, ID);
        this.vehicle = vehicle;
    }

    public void work() {
        System.out.println(getName() + "开着车来公司了");
        vehicle.start(30);
    }
}
