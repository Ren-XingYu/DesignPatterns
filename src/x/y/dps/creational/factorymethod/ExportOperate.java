package x.y.dps.creational.factorymethod;

public abstract class ExportOperate {
    protected abstract ExportFileApi factoryMethod();

    public boolean export(String data){
        ExportFileApi api=factoryMethod();
        api.export(data);
        return true;
    }
}
