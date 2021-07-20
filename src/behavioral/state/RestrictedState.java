package behavioral.state;

// 受限状态类 充当具体状态类
public class RestrictedState extends AccountState{
    public RestrictedState(AccountState state) {
        this.account = state.account;
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("状态受限，取款失败！");
    }

    @Override
    public void computeInterest() {
        System.out.println("计算利息");
    }

    // 状态转换
    @Override
    public void stateCheck() {
        if (account.getBalance() > 0) {
            account.setState(new NormalState(this));
        } else if (account.getBalance() > -2000) {
            account.setState(new OverdraftState(this));
        }
    }
}
