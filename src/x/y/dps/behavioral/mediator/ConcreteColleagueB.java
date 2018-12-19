package x.y.dps.behavioral.mediator;

public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    public void someOperation(){
        //在需要跟其他同事对象通信的时候，通知中介者对象
        getMediator().changed(this);
    }
}
