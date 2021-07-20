package behavioral.strategy;

// 电影票类，充当环境类
public class MovieTicket {
    private double price;
    // 维持一个对抽象折扣类的引用
    private Discount discount;

    public void setPrice(double price) {
        this.price = price;
    }

    // 注入一个折扣类对象
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getPrice() {
        return discount.calculate(price);
    }
}
