package creation.factory.factoryMethod;

public class DatabaseLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        // 连接数据库
        // 创建数据库日志对象
        Logger logger = new DatabaseLogger();
        // 初始化日志信息，记录日志
        return logger;
    }
}
