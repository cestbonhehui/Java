package cn.hh.static_proxy;

/**
 * @Author admin
 * @Date 2022/2/9 17:49
 * @Version 1.0
 */
public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("火车站买票");
    }
}
