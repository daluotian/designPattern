package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

// 员工列表类 充当对象结构
public class EmployeeList {
    // 定义一个集合用于存储员工对象
    private List<Employee> list = new ArrayList<>();

    public void addEmployee(Employee employee) {
        list.add(employee);
    }

    // 遍历访问员工集合类中的每一个员工
    public void accept(Department handler) {
        for (Employee e : list) {
            e.accept(handler);
        }
    }
}
