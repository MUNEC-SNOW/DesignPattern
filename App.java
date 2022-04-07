import Iterator.*;
import TemplatePattern.CoffeeWithHook;

/**
 * @author KW
 */
public class App {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMMenu dinerMenu = new DinnerMMenu();
        CafeMenu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress((Menu) pancakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }
}
