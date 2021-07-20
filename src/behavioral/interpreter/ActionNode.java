package behavioral.interpreter;

// 动作节点类
public class ActionNode extends AbstractNode{
    private String action;

    public ActionNode(String action) {
        this.action = action;
    }

    // 动作表达式的解释操作
    @Override
    public String interpret() {
        if (action.equalsIgnoreCase("move")) {
            return "移动";
        } else if (action.equalsIgnoreCase("run")) {
            return "快速移动";
        } else {
            return "无效指令";
        }
    }
}
