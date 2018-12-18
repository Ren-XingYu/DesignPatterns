package x.y.dps.structural.decorator;

public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    private String addedState;

    public String getAddedState(){
        return addedState;
    }

    public void setAddedState(String addedState) {
        this.addedState = addedState;
    }

    @Override
    public void operation() {
        //可以在这里添加功能
        super.operation();
        System.out.println("ConcreteDecoratorA 增加的状态");
    }
}
