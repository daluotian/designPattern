package creation.factory.simpleFactory;

public class Client {
    public static void main(String[] args) {
        String charType = XMLUtil.getCharType();
        Chart chart = ChartFactory.getChart(charType);
        chart.display();
    }
}
