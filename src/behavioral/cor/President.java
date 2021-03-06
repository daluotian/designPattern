package behavioral.cor;

// 董事长类，充当处理者
public class President extends Approver{

    public President(String name) {
        super(name);
    }

    @Override
    // 具体请求处理方法
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 500000) {
            System.out.println("董事长" + this.name + "审批采购单：" + request.getNumber() + "金额："
            + request.getAmount() + "元，处理目的：" + request.getPurpose() + "。");
            // 处理请求
        } else {
            // 转发请求
            this.successor.processRequest(request);
        }
    }
}
