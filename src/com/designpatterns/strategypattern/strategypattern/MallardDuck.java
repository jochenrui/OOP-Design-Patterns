package com.designpatterns.strategypattern.strategypattern;

import com.designpatterns.strategypattern.strategypattern.duckbehavior.FlyWithWings;
import com.designpatterns.strategypattern.strategypattern.duckbehavior.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I'm a mallard duck");
    }
}