package behavioral.visitor;

// 财务部类 充当具体访问者
public class FADepartment extends Department{
    // 实现财务部对全职员工的访问
    @Override
    public void visit(FullTimeEmployee employee) {
        int wordTime = employee.getWorkTime();
        double weekWage = employee.getWeeklyWage();
        if (wordTime > 40) {
            weekWage = weekWage + (wordTime - 40) * 100;
        } else if (wordTime < 40) {
            weekWage = weekWage - (wordTime - 40) * 80;
            if (weekWage < 0) {
                weekWage = 0;
            }
        }
        System.out.println("正式员工" + employee.getName() + "实际工资为：" + weekWage + "元。");
    }

    // 实现财务部对兼职员工的访问
    @Override
    public void visit(PartTimeEmployee employee) {
        int workTime = employee.getWorkTime();
        double hourWage = employee.getHourWage();
        System.out.println("临时工" + employee.getName() + "实际工资为：" + (workTime * hourWage) + "元。");
    }
}
