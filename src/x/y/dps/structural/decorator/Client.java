package x.y.dps.structural.decorator;

public class Client {
    public static void main(String[] args){
        Component component=new ConcreteComponent();
        Decorator decorator=new ConcreteDecoratorB(component);
        decorator.operation();
    }
}
