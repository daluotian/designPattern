package behavioral.interpreter;

// AND节点类，充当非终结符表达式
public class AndNode extends AbstractNode{
    // and的左表达式
    private AbstractNode left;
    // and的右表达式
    private AbstractNode right;

    public AndNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String interpret() {
        return left.interpret() + "再" + right.interpret();
    }
}
