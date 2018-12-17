package x.y.dps.creational.singleton;

/**
 * 在Java中一种更好的单例实现方式
 */
public class HolderSingleton {
    /**
     * 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例
     * 没有绑定关系，而且只有被调用到时才会被装载，从而实现了延迟加载
     */
    private static class SingletonHolder{
        /**
         * 静态初始化器，有JVM来保证线程安全
         */
        private static HolderSingleton instance=new HolderSingleton();
    }

    private HolderSingleton(){}

    public static HolderSingleton getInstance(){
        return SingletonHolder.instance;
    }

    //其他操作
}
