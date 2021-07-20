package behavioral.observer;

// 具体指挥部类，充当具体目标类
public class ConcreteAllyControlCenter extends AllyControlCenter{
    public ConcreteAllyControlCenter(String allyName) {
        System.out.println(allyName + "战队创建成功！");
        System.out.println("-----------------");
        this.allyName = allyName;
    }

    // 实现通知方法
    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allyName + "战队通知，盟友" + name + "遭受敌人攻击！");
        // 遍历观察者集合，调用每一个盟友，除自己外的支援方法
        for (Observer obs : players) {
            if (!obs.getName().equalsIgnoreCase(name)) {
                obs.help();
            }
        }
    }
}
