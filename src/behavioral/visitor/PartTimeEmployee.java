package behavioral.visitor;

// 兼职员工类 充当具体元素类
public class PartTimeEmployee implements Employee{
    // 员工姓名
    private String name;
    // 员工时薪
    private double hourWage;
    // 工作时间
    private int workTime;

    public PartTimeEmployee(String name, double hourWage, int workTime) {
        this.name = name;
        this.hourWage = hourWage;
        this.workTime = workTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourWage() {
        return hourWage;
    }

    public void setHourWage(double hourWage) {
        this.hourWage = hourWage;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    @Override
    public void accept(Department handler) {
        // 调用访问者的访问方法
        handler.visit(this);
    }
}
