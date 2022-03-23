package adapter.object;

public class MDuck implements ADuck{
    @Override
    public void fly() {
        System.out.println("I'm Flying!!");
    }

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
