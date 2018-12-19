package x.y.dps.creational.prototype;

public class ConcretePrototype1 implements Prototype {

    @Override
    public Prototype clone() {
        Prototype prototype=new ConcretePrototype1();
        return prototype;
    }
}
