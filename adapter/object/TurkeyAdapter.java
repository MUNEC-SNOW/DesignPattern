package adapter.object;

public class TurkeyAdapter implements ADuck{
    Turkey turkey;
    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    @Override
    public void fly() {
        for (int i = 0; i < 5; i++){
            turkey.fly();
        }
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
