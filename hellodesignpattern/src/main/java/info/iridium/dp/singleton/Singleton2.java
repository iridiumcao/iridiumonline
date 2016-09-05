package info.iridium.dp.singleton;

/**
 * 懒汉单例模式
 * 
 * 这种写法的缺陷在于可能有线程同步问题。
 * 
 * Created by caoi on 2015/3/2.
 */
public class Singleton2 {
    private static volatile Singleton2 singleton = null; // 加 volatile 是为了避免同步问题。

    public static Singleton2 generateSingleton() {
        if (null == singleton) {
            singleton = new Singleton2();
        }
        return singleton;
    }

    private Singleton2() {
    }
}