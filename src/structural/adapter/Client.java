package structural.adapter;

public class Client {
    public static void main(String[] args) {
        CarController car;
        car = (CarController)XMLUtil.getBean();
        car.phonate();
        car.twinkle();
    }
}
