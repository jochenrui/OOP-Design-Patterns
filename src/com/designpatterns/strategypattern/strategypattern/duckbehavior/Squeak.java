package com.designpatterns.strategypattern.strategypattern.duckbehavior;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
