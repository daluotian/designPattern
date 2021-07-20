package structural.bridge;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    public static Object getBean (String args) {
        try {
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            Document document = builder.parse(new File("src/structural/bridge/config.xml"));

            NodeList nl = null;
            Node classNode = null;
            String cName = null;
            nl = document.getElementsByTagName("className");

            if (args.equals("image")) {
                // 获取第一个包含类名的节点，即扩充抽象类
                classNode = nl.item(0).getFirstChild();
            } else if (args.equals("os")) {
                // 获取第一个包含类名的节点，即具体实现类
                classNode = nl.item(1).getFirstChild();
            }
            cName = classNode.getNodeValue();
            // 通过类名生成实例对象并将其返回
            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
