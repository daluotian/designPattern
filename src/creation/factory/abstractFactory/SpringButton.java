package creation.factory.abstractFactory;

public class SpringButton implements Button{
    @Override
    public void display() {
        System.out.println("显示浅绿色按钮");
    }
}
