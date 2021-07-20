package structural.facade;

public class Client {
    public static void main(String[] args) {
        /* EncryptFacade ef = new EncryptFacade();
        ef.fileEncrypt("src/structural/facade/src.txt", "src/structural/facade/des.txt"); */
        AbstractEncryptFacade ef;
        ef = (AbstractEncryptFacade) XMLUtil.getBean();
        ef.fileEncrypt("src/structural/facade/src.txt", "src/structural/facade/des.txt");
    }
}
