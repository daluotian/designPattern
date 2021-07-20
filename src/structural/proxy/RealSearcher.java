package structural.proxy;

public class RealSearcher implements Searcher{
    @Override
    // 模拟查询商务信息
    public String doSearch(String userId, String keyword) {
        System.out.println("用户" + userId + "使用关键词" + keyword + "查询了商务信息！");
        return "返回具体内容";
    }
}
