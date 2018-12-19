package x.y.dps.creational.prototype;

public class Client {
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public void operation(){
        Prototype newPrototype=prototype.clone();
    }
}
