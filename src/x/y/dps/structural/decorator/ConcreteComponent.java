package x.y.dps.structural.decorator;

public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("公用功能");
    }
}
