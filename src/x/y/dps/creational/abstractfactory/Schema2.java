package x.y.dps.creational.abstractfactory;

public class Schema2 implements AbstractFactory {
    @Override
    public CPUApi createCPUApi() {
        return new AMDCPU(939);
    }

    @Override
    public MainboardApi createMainBoardApi() {
        return new MSIMainboard(939);
    }
}
