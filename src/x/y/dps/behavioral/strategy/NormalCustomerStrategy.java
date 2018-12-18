package x.y.dps.behavioral.strategy;

public class NormalCustomerStrategy implements Strategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("对于新手客户或普通客户没有折扣");
        return goodsPrice;
    }
}
