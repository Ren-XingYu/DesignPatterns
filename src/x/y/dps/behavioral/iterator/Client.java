package x.y.dps.behavioral.iterator;

public class Client {
    public void someOperation(){
        String[] names={"张三","李四","王五"};
        Aggregate aggregate=new ConcreteAggregate(names);
        Iterator it=aggregate.createIterator();
        it.first();
        while (!it.isDone()){
            Object obj=it.currentItem();
            System.out.println("the obj=="+obj);
            it.next();
        }
    }

    public static void main(String[] args){
        Client client=new Client();
        client.someOperation();
    }
}
