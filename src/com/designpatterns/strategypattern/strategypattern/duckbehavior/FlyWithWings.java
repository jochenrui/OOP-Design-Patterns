package com.designpatterns.strategypattern.strategypattern.duckbehavior;

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying!");
    }
}
