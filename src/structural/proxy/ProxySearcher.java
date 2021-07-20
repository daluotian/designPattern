package structural.proxy;

public class ProxySearcher implements Searcher{
    // 维持一个对真实主题的引用
    private RealSearcher searcher = new RealSearcher();
    private AccessValidator validator;
    private Logger logger;

    @Override
    public String doSearch(String userId, String password) {
        // 如果省验证成功，则执行查询
        if (this.validator(userId)) {
            String result = searcher.doSearch(userId, password);

            this.log(userId);
            return result;
        } else {
            return null;
        }
    }

    // 创建访问验证对象并调用其validator方法实现身份验证
    public boolean validator(String userId) {
        validator = new AccessValidator();
        return validator.validator(userId);
    }

    // 创建日志记录对象并调用其log方法实现日志记录
    public void log(String userId) {
        logger = new Logger();
        logger.log(userId);
    }
}
