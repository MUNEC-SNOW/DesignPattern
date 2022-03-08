package StrategyPattern;

import StrategyPattern.behavior.Fly.FlyNoWay;
import StrategyPattern.behavior.Quack.Quack;

public class ModelDuck extends AbstractDuck{
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("Im a model duck");
    }
}
