package behavioral.observer;

// 战队成员类，具体观察者类
public class Player implements Observer{
    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    // 支援盟友
    @Override
    public void help() {
        System.out.println("坚持住，" + this.name + "正在赶来救你！");
    }

    // 遭受攻击的方法，调用助会中心的通知方法notifyObserver()
    @Override
    public void beAttacked(AllyControlCenter acc) {
        System.out.println(this.name + "遭受攻击");
        acc.notifyObserver(this.name);
    }
}
