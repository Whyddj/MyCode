package com.why.backend0010;

public class interfaceDemo {
    public static void main(String[] args){
        Bike bike = new Bike();
        Bus bus = new Bus();

        bike.start(10);
        bike.stop(3);

        bus.start(50);
        bus.stop(1);
    }
}
