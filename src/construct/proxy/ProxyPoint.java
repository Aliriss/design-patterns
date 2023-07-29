package construct.proxy;

/**
 * @author all
 * @since 2023/7/18 17:09
 */

public class ProxyPoint implements SellTickets {

    private final TrainStation trainStation = new TrainStation();
    @Override
    public void sell() {
        System.out.println("ProxyPoint sells tickets...\nService fee charged at the agency outlet...");
        trainStation.sell();
    }
}
