package StrategyPattern.behavior.Fly;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly(){
        System.out.println("IM fly with Rocket!!!!!!");
    }
}
