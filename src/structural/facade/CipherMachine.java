package structural.facade;

// 数据加密类
public class CipherMachine {
    public String encrypt(String plainText) {
        System.out.print("将明文转成密文");
        String es = "";
        for (int i = 0; i < plainText.length(); i++) {
            String c = String.valueOf(plainText.charAt(i) % 7);
            es += c;
        }
        System.out.println(es);
        return es;
    }
}
