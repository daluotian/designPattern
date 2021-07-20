package behavioral.mediator;

public class Client {
    public static void main(String[] args) {
        // 定义终结者对象
        ConcreteMediator mediator;
        mediator = new ConcreteMediator();

        // 定义同事对象
        Button addButton = new Button();
        List list = new List();
        ComboBox cb = new ComboBox();
        TextBox userNameTB = new TextBox();

        addButton.setMediator(mediator);
        list.setMediator(mediator);
        cb.setMediator(mediator);
        userNameTB.setMediator(mediator);

        mediator.addButton = addButton;
        mediator.list = list;
        mediator.cb = cb;
        mediator.userNameTextBox = userNameTB;

        addButton.changed();
        System.out.println("------------------------");
        list.changed();
    }
}
