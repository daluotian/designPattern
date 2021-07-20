package behavioral.cor;

// 董事会类，充当处理者
public class Congress extends Approver{

    public Congress(String name) {
        super(name);
    }

    @Override
    // 具体请求处理方法
    public void processRequest(PurchaseRequest request) {
        System.out.println("董事会" + this.name + "审批采购单：" + request.getNumber() + "金额："
        + request.getAmount() + "元，处理目的：" + request.getPurpose() + "。");
        // 处理请求
    }
}
