package behavioral.command;

// 多功能按键类，充当请求调用者
public class FunctionButton {
    // 维持一个命令对象的引用
    private Command command;

    // 为功能按键注入命令
    public void setCommand(Command command) {
        this.command = command;
    }

    // 发送请求的办法
    public void click() {
        System.out.print("单击功能键：");
        command.execute();
    }
}
