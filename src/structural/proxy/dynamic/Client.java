package structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        InvocationHandler handler = null;
        AbstractUserDao userDao = new UserDAO();
        handler = new DAOLogHandler(userDao);
        AbstractUserDao proxy = null;

        proxy = (AbstractUserDao) Proxy.newProxyInstance(AbstractUserDao.class.getClassLoader(), new Class[] {AbstractUserDao.class}, handler);
        proxy.findUserById("张无忌");

        System.out.println("----------------------");

        AbstractDocumentDAO docDAO = null;
        docDAO = new DocumentDAO();
        handler = new DAOLogHandler(docDAO);
        AbstractDocumentDAO proxy_new = null;

        proxy_new = (AbstractDocumentDAO) Proxy.newProxyInstance(AbstractDocumentDAO.class.getClassLoader(), new Class[] {AbstractDocumentDAO.class}, handler);
        proxy_new.deleteDocumentById("DOO1");
    }
}
