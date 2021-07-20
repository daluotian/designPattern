package behavioral.strategy;

public class VIPDiscount implements Discount{
    private final double DISCOUNT = 0.5;
    @Override
    public double calculate(double price) {
        System.out.println("VIP票：");
        System.out.println("加积分！");
        return price * DISCOUNT;
    }
}
