package behavioral.command;

// 帮助命令类，充当具体命令类
public class HelpCommand extends Command{
    // 维持对请求接受者的引用
    private DisplayHelpClass hcObj;

    public HelpCommand() {
        hcObj = new DisplayHelpClass();
    }

    @Override
    void execute() {
        hcObj.display();
    }
}
