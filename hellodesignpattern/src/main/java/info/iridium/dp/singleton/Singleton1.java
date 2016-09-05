package info.iridium.dp.singleton;

/**
 * 饿汉单例模式
 * 
 * 这种写法的缺陷是，它不是懒加载的（lazy initialization）的，一旦开始加载类，实例就创建了。而且，这种写法可能无法适用某些场景：比如对象要通过
 * 配置文件创建，而且需要几个参数。
 * 
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