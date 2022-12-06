package com.why.backend0010;

public class Bike implements Vehicle {
    @Override
    public void start(int speed) {
        System.out.println("自行车正在以" + speed + "km/h的速度向前走");
    }

    @Override
    public void stop(int time) {
        System.out.println("自行车在" + time + "s后停了下来");
    }
}
