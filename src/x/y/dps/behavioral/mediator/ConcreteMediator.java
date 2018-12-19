package x.y.dps.behavioral.mediator;

public class ConcreteMediator implements Mediator {

    private ConcreteColleagueA colleagueA;
    private ConcreteColleagueB colleagueB;

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void changed(Colleague colleague) {
        //某个同事类发生变化，通常需要与其他同事交互
        //具体协调相应的同事对象来实现协作行为
    }
}
