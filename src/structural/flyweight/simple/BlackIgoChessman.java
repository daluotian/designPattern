package structural.flyweight.simple;

// 黑棋子类，充当具体享元类
public class BlackIgoChessman extends IgoChessman{
    @Override
    public String getColor() {
        return "黑色";
    }
}
