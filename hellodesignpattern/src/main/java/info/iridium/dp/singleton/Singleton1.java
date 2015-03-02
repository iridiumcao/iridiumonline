package info.iridium.dp.singleton;

/**
 * 饿汉单例模式
 * <p/>
 * Created by caoi on 2015/3/2.
 */
public class Singleton1 {
    private static final Singleton1 INSTANCE = new Singleton1();

    public static Singleton1 generateSingleton() {
        return INSTANCE;
    }

    private Singleton1() {
    }
}