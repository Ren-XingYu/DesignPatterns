package x.y.dps.structural.proxy;

public class Client {
    public static void main(String[] args){
        RealSubject subject=new RealSubject();
        Proxy proxy=new Proxy(subject);
        proxy.request();
    }
}
