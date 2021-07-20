package structural.flyweight.simple;

import java.util.Hashtable;

// 围棋棋子工厂类，充当享元工厂类，使用单例模式对其进行设计
public class IgoChessmanFactory {
    private static IgoChessmanFactory instance = new IgoChessmanFactory();
    // 使用HashTable来存储享元对象，充当享元池
    private static Hashtable ht;

    private IgoChessmanFactory() {
        ht = new Hashtable();
        IgoChessman black, white;
        black = new BlackIgoChessman();
        white = new WhiteIgoChessman();
        ht.put("b", black);
        ht.put("w", white);
    }

    // 返回工厂实例
    public static IgoChessmanFactory getInstance() {
        return instance;
    }

    // 通过key获取存储在HashTable中的享元对象
    public IgoChessman getIgoChessman(String color) {
        return (IgoChessman) ht.get(color);
    }
}
