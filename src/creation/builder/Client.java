package creation.builder;

public class Client {
    public static void main(String[] args) {
        // 针对抽象建造者编程
        ActorBuilder ab;
        // 反射生成具体建造者对象
        ab = (ActorBuilder)XMLUtil.getBean();

        ActorController ac = new ActorController();
        Actor actor;
        // 通过指挥者创建完整的建造者对象
        actor = ac.construct(ab);

        System.out.println(actor);
    }
}
