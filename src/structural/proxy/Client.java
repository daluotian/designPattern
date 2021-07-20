package structural.proxy;

public class Client {
    public static void main(String[] args) {
        Searcher searcher;
        searcher = (Searcher) XMLUtil.getBean();
        String result = searcher.doSearch("杨过", "玉女心经");
        System.out.println(result);
    }
}
