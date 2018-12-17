package x.y.dps.creational.singleton;

public class HungrySingleton {
    private static HungrySingleton instance=new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return instance;
    }

    //其他操作
}
