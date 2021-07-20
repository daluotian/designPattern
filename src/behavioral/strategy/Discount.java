package behavioral.strategy;

// 折扣类，充当抽象策略类
public interface Discount {
    double calculate(double price);
}
