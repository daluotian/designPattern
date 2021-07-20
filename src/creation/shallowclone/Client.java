package creation.shallowclone;

public class Client {
    public static void main(String[] args) {
        WeeklyLog log_previous, log_new = null;
        log_previous = new WeeklyLog();
        Attachment attachment = new Attachment();
        // 将附件添加到周报中
        log_previous.setAttachment(attachment);
        // 调用克隆方法创建克隆对象
        // log_new = log_previous.clone();
        try {
            log_new = log_previous.deepClone();
        } catch (Exception e) {
            System.err.println("克隆失败");
        }
        // 比较周报
        System.out.println("周报是否相同？" + (log_previous == log_new));
        // 比较附件
        System.out.println("附件是否相同？" + (log_previous.getAttachment() == log_new.getAttachment()));
    }
}
