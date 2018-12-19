package x.y.dps.behavioral.mediator;

/**
 * 同事类的抽象父类
 */
public abstract class Colleague {
    /**
     * 持有中介对象，每一个同事类都知道它的中介对象
     */
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }
}
