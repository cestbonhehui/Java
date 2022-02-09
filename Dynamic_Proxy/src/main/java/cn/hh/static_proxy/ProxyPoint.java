package cn.hh.static_proxy;

/**
 * @Author admin
 * @Date 2022/2/9 17:59
 * @Version 1.0
 */
public class ProxyPoint implements SellTickets{
    //声明火车站类对象
    private TrainStation trainStation=new TrainStation();

    @Override
    public void sell() {
        System.out.println("增加某些功能：例如收取服务费");
        trainStation.sell();
    }
}
