package com.designpatterns.strategypattern.strategypattern;

import com.designpatterns.strategypattern.strategypattern.duckbehavior.FlyNoWay;
import com.designpatterns.strategypattern.strategypattern.duckbehavior.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("I'm a model duck");
    }
}
