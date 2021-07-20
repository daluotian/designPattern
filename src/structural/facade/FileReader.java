package structural.facade;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 文件读取类
public class FileReader {
    public String read(String fileNameSrc) {
        System.out.print("读取文件，获取明文：");
        StringBuffer sb = new StringBuffer();
        try {
            FileInputStream inFS = new FileInputStream(fileNameSrc);
            int data;
            while ((data = inFS.read()) != -1) {
                sb.append((char) data);
            }
            inFS.close();
            System.out.println(sb);
        } catch (FileNotFoundException e) {
            System.err.println("文件不存在！");
        } catch (IOException e ) {
            System.err.println("操作文件错误！");
        }
        return sb.toString();
    }
}
