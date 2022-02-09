package cn.hh.static_proxy;

/**
 * @Author admin
 * @Date 2022/2/9 18:04
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建代售点类对象
        ProxyPoint proxyPoint = new ProxyPoint();
        //调用方法进行卖票
        proxyPoint.sell();
    }
}
