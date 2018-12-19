package x.y.dps.creational.prototype;

public class ConcretePrototype2 implements Prototype {
    @Override
    public Prototype clone() {
        Prototype prototype=new ConcretePrototype2();
        return prototype;
    }
}
