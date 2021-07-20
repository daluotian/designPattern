package behavioral.interpreter;

// 距离节点类
public class DistanceNode extends AbstractNode{
    private String distance;

    public DistanceNode(String distance) {
        this.distance = distance;
    }

    @Override
    public String interpret() {
        return this.distance;
    }
}
