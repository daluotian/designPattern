package behavioral.cor;

public class Client {
    public static void main(String[] args) {
        Approver wjzhang, gyang, jguo, meeting;
        wjzhang = new Director("张无忌");
        gyang = new VicePresident("杨过");
        jguo = new President("郭靖");
        meeting = new Congress("董事会");

        // 创建职责链
        wjzhang.setSuccessor(gyang);
        gyang.setSuccessor(jguo);
        jguo.setSuccessor(meeting);

        // 创建采购单
        PurchaseRequest pr1 = new PurchaseRequest(45000, 1001, "采购倚天剑");
        wjzhang.processRequest(pr1);

        PurchaseRequest pr2 = new PurchaseRequest(60000, 1002, "采购葵花宝典");
        wjzhang.processRequest(pr2);

        PurchaseRequest pr3 = new PurchaseRequest(16000, 1003, "采购金刚经");
        wjzhang.processRequest(pr3);

        PurchaseRequest pr4 = new PurchaseRequest(80000, 1004, "采购桃花岛");
        wjzhang.processRequest(pr4);
    }
}
