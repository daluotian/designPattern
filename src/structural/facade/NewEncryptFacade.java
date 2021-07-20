package structural.facade;

public class NewEncryptFacade extends AbstractEncryptFacade{
    // 维护队子系统对象的引用
    private FileReader fileReader;
    private NewCipherMachine cipherMachine;
    private FileWriter fileWriter;

    public NewEncryptFacade() {
        fileReader = new FileReader();
        cipherMachine = new NewCipherMachine();
        fileWriter = new FileWriter();
    }

    @Override
    void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainStr = fileReader.read(fileNameSrc);
        String encryptStr = cipherMachine.encrypt(plainStr);
        fileWriter.write(encryptStr, fileNameDes);
    }
}
