package creation.builder;

public abstract class ActorBuilder {
    protected Actor actor = new Actor();

    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairstyle();

    // 工厂方法，返回一个完整的游戏角色
    public Actor createActor() {
        return actor;
    }
}
