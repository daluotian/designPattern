package structural.flyweight.simple;

import structural.flyweight.extend.Coordinates;

// 棋子抽象类，充当抽象享元类
public abstract class IgoChessman {
    public abstract String getColor();

    public void display(Coordinates coord) {
        System.out.println("棋子颜色：" + this.getColor() + "，棋子位置：" + coord.getX() + "，" + coord.getY());
    }
}
