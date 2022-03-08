package StrategyPattern.behavior.Fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly(){
        System.out.println("I CANT FLY!!!!!!");
    }
}
