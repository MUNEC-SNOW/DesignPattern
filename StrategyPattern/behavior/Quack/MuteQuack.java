package StrategyPattern.behavior.Quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< SILENCE >>");
    }
}
