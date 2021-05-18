package com.designpatterns.strategypattern.strategypattern.duckbehavior;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
