package structural.flyweight.simple;

// 白棋子类，充当具体享元类
public class WhiteIgoChessman extends IgoChessman{
    @Override
    public String getColor() {
        return "白色";
    }
}
