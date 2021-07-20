package behavioral.command;

public class Client {
    public static void main(String[] args) {
        FunctionButton fb = new FunctionButton();
        Command command;
        command = (Command) XMLUtil.getBean();

        fb.setCommand(command);
        fb.click();
    }
}
