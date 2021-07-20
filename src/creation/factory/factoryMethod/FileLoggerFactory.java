package creation.factory.factoryMethod;

public class FileLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        // 创建文件日志对象
        Logger logger = new FileLogger();
        return logger;
    }
}
