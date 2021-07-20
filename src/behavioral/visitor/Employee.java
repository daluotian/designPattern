package behavioral.visitor;

// 员工类 充当抽象元素类
public interface Employee {
    void accept(Department handler);
}
