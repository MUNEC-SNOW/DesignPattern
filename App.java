import adapter.object.ADuck;
import adapter.object.MDuck;
import adapter.object.TurkeyAdapter;
import adapter.object.WildTurkey;

/**
 * @author KW
 */
public class App {
    public static void main(String[] args) {
        MDuck duck = new MDuck();
        WildTurkey turkey = new WildTurkey();
        ADuck turkeyAdapter = new TurkeyAdapter(turkey);
        testDuck(duck);
        testDuck(turkeyAdapter);
    }

    static void testDuck(ADuck duck){
        duck.quack();
        duck.fly();
    }
}
