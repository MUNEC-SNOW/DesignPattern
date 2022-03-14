package SingletonPattern;

/**
 * @author KW
 */
public class DoubleCheckLockSingleton {
    private volatile static DoubleCheckLockSingleton uniqueDCLSingleton;
    private DoubleCheckLockSingleton() {}
    public static DoubleCheckLockSingleton getInstance() {
        if (uniqueDCLSingleton == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (uniqueDCLSingleton == null) {
                    uniqueDCLSingleton = new DoubleCheckLockSingleton();
                }
            }
        }
        return uniqueDCLSingleton;
    }
}
