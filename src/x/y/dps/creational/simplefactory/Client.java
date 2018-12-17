package x.y.dps.creational.simplefactory;

public class Client {
    public static void main(String[] args){
        Api api=SimpleFactory.createApi();
        api.operation("hello");
    }
}
