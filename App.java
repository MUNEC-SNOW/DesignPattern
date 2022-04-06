import TemplatePattern.CoffeeWithHook;

/**
 * @author KW
 */
public class App {
    public static void main(String[] args) {
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("\nMaking coffee with Hook:");
        coffeeWithHook.prepareRecipe();
    }
}
