package com.designpatterns.strategypattern.strategypattern.duckbehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
