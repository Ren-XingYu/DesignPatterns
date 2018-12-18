package x.y.dps.structural.decorator;

public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    private void addedBehavior(){
        System.out.println("ConcreteDecoratorB 增加的行为");
    }

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }
}
