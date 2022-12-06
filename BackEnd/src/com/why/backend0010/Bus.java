package com.why.backend0010;

public class Bus implements Vehicle{

    @Override
    public void start(int speed) {
        System.out.println("公交车正在以" + speed + "km/h的速度向前行驶");
    }

    @Override
    public void stop(int time) {
        System.out.println("公交车在" + time + "s后停了下来");
    }
}
