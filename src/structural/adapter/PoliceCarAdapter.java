package structural.adapter;

public class PoliceCarAdapter extends CarController{
    // 自定义适配者PoliceSound对象
    private PoliceSound sound;
    // 自定义适配者PoliceLamp对象
    private PoliceLamp lamp;

    public PoliceCarAdapter() {
        sound = new PoliceSound();
        lamp = new PoliceLamp();
    }

    @Override
    public void phonate() {
        // 调用适配者类的方法
        sound.alarmSound();
    }

    @Override
    public void twinkle() {
        lamp.alarmLamp();
    }
}
