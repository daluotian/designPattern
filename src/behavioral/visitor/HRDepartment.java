package behavioral.visitor;

// 人力资源部 充当具体访问类
public class HRDepartment extends Department {
    // 实现人力资源部对正式员工的访问
    @Override
    public void visit(FullTimeEmployee employee) {
        int workTime = employee.getWorkTime();
        System.out.println("正式员工" + employee.getName() + "实际工作时间为：" + workTime + "小时。");
        if (workTime > 40) {
            System.out.println("正式员工" + employee.getName() + "加班时间为：" + workTime + "小时。");
        } else if (workTime < 40) {
            System.out.println("正式员工" + employee.getName() + "请假时间为：" + workTime + "小时。");
        }
    }

    @Override
    public void visit(PartTimeEmployee employee) {
        int workTime = employee.getWorkTime();
        System.out.println("临时员工" + employee.getName() + "实际工作时间为：" + workTime + "小时。");
    }
}
