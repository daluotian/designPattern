package creation.factory.factoryMethod;

public class Client {
    public static void main(String[] args) {
        LoggerFactory factory;
        Logger logger;
        /* // 可以引入配置文件，使用反射创建日志工厂
        factory = new FileLoggerFactory();
        logger = factory.createLogger(); */
        factory = (LoggerFactory) XMLUtil.getBean();
        logger = factory.createLogger();
        logger.writeLog();
    }
}
