package behavioral.state;

// 银行账户，充当环境类
public class Account {
    // 维持一个对抽象状态对象的引用
    private AccountState state;
    // 开户名
    private String owner;
    // 账户余额
    private double balance = 0;

    public Account(String owner, double init) {
        this.owner = owner;
        this.balance = init;
        this.state = new NormalState(this);
        System.out.println(this.owner + "开户，初始金额为：" + init);
        System.out.println("-----------------------");
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public void deposit(double amount) {
        System.out.println(this.owner + "存款" + amount);
        // 调用状态对象的 deposit() 方法
        state.deposit(amount);
        System.out.println("现在余额为：" + this.balance);
        System.out.println("现在账户状态为：" + this.state.getClass().getName());
        System.out.println("-----------------------");
    }

    public void withdraw(double amount) {
        System.out.println(this.owner + "存款" + amount);
        // 调用状态对象的 withdraw() 方法
        state.withdraw(amount);
        System.out.println("现在余额为：" + this.balance);
        System.out.println("现在账户状态为：" + this.state.getClass().getName());
        System.out.println("-----------------------");
    }

    public void computeInterest() {
        // 调用状态对象的 computeInterest() 方法
        state.computeInterest();
    }
}
