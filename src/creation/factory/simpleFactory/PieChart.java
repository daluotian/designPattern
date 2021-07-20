package creation.factory.simpleFactory;

public class PieChart implements Chart{
    public PieChart () {
        System.out.println("创建饼图");
    }

    @Override
    public void display() {
        System.out.println("显示饼图");
    }
}
