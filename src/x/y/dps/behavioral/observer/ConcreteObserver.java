package x.y.dps.behavioral.observer;

/**
 * 具体观察者对象，实现更新方法，使自己的状态和目标的状态保持一致
 */
public class ConcreteObserver implements Observer {
    /**
     * 示意，观察者的状态
     */
    private String observerState;
    @Override
    public void update(Subject subject) {
        observerState=((ConcreteSubject)subject).getSubjectState();
    }
}
