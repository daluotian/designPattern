package creation.singleton;

public class Client {
    public static void main(String[] args) {
        LoadBalancer loadBalancer1, loadBalancer2, loadBalancer3, loadBalancer4;
        loadBalancer1 = LoadBalancer.getLoadBalancerInstance();
        loadBalancer2 = LoadBalancer.getLoadBalancerInstance();
        loadBalancer3 = LoadBalancer.getLoadBalancerInstance();
        loadBalancer4 = LoadBalancer.getLoadBalancerInstance();

        // 判断服务器负载均衡器是否相同
        if (loadBalancer1 == loadBalancer2 && loadBalancer2 == loadBalancer3 && loadBalancer3 == loadBalancer4) {
            System.out.println("服务器负载均衡器具有唯一性！");
        }
    }
}
