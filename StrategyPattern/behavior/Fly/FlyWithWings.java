package StrategyPattern.behavior.Fly;

/**
 * @author KW
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("IM FLYING!!!");
    }
}

