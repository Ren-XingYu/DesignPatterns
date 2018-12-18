package x.y.dps.behavioral.strategy;

public class Client {
    public static void main(String[] args){
        Strategy strategy=new LargeCustomerStrategy();
        PriceContext context=new PriceContext(strategy);
        double quote=context.quote(1000);
        System.out.println("向客户报价："+quote);
    }
}
