package StrategyPattern.ducks;

import StrategyPattern.behavior.Fly.FlyNoWay;
import StrategyPattern.behavior.Quack.Quack;

/**
 * @author Administrator
 */
public class DuckCall extends AbstractDuck {
    public DuckCall(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("Im real Duck Call");
    }
}
