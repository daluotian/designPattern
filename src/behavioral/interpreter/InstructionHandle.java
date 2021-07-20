package behavioral.interpreter;

import java.util.Stack;

public class InstructionHandle {
    private AbstractNode node;

    public void handle(String instruction) {
        AbstractNode left = null, right = null;
        AbstractNode direction = null, action = null, distance = null;

        // 声明一个栈对象用于存储抽象语法树
        Stack<AbstractNode> stack = new Stack<>();

        String[] words = instruction.split(" ");
        for (int i = 0; i < words.length; i++) {
            // 实例采用栈的方式处理指令，如果遇到"and"，则将其后的三个单词作为3个终结符表达式连城一个简单的句子 SentenceNode 作为
            // "and"的右表达式，而将从栈顶弹出的表达式作为"and"的左表达式，最后将新的"and"表达式压入栈中
            if (words[i].equalsIgnoreCase("and")) {
                // 弹出栈顶表达式作为左表达式
                left = (AbstractNode) stack.pop();
                String word1 = words[++i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                right = new SentenceNode(direction, action, distance);
                stack.push(new AndNode(left, right));
            } else {
                // 如果是从头开始解释，则将前3个单词组成一个简单句子 SentenceNode 并将该句子压入栈中
                String word1 = words[i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                left = new SentenceNode(direction, action, distance);
                stack.push(left);
            }
        }
        // 将全部表达式从栈中弹出
        this.node = (AbstractNode) stack.pop();
    }

    public String output() {
        String result = node.interpret();
        return result;
    }
}
