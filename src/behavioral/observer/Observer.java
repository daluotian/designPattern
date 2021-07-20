package behavioral.observer;

// 抽象观察者类
public interface  Observer {
    String getName();
    void setName(String name);
    // 声明支援方法
    void help();
    // 声明遭受攻击的方法
    void beAttacked(AllyControlCenter acc);
}
