package com.designpatterns.strategypattern;


import com.designpatterns.strategypattern.strategypattern.MallardDuck;
import com.designpatterns.strategypattern.strategypattern.ModelDuck;
import com.designpatterns.strategypattern.strategypattern.duckbehavior.FlyRocketPowered;

/**
 * the strategy pattern groups algorithms together
 * the classes using the Algorithms talk to the Interface
 * this way the Algorithm can change at Runtime, because the
 * Interface can be any of the Algorithms implementing it
 */

public class Main {

    public static void main(String[] args){
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuack();

        /**
         * change behavior of existing duck -> only possible by
         * extracting fly & quack behavior from Duck into seperate classes
         * -> allows to change behavior during runtime
         */
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}

