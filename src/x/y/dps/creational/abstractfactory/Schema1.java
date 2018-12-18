package x.y.dps.creational.abstractfactory;

public class Schema1 implements AbstractFactory {
    @Override
    public CPUApi createCPUApi() {
        return new IntelCPU(1156);
    }

    @Override
    public MainboardApi createMainBoardApi() {
        return new GAMainboard(1156);
    }
}
