package behavioral.command;

// 退出命令类，充当具体命令类
public class ExitCommand extends Command {
    // 维持对请求接收者的引用
    private SystemExitClass seObj;

    public ExitCommand() {
        this.seObj = new SystemExitClass();
    }

    @Override
    void execute() {
        seObj.exit();
    }
}
