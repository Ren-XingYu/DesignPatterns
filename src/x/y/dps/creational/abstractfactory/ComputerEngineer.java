package x.y.dps.creational.abstractfactory;

public class ComputerEngineer {
    private CPUApi cpuApi=null;
    private MainboardApi mainboardApi=null;

    public void makeComputer(AbstractFactory schema){
        //1、首先准备好装机所需要的配件
        prepareHardwares(schema);
        //2、组装、测试、交付
    }

    private void prepareHardwares(AbstractFactory schema) {
        this.cpuApi=schema.createCPUApi();
        this.mainboardApi=schema.createMainBoardApi();

        this.cpuApi.calculate();
        this.mainboardApi.installCPU();
    }
}
