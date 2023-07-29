package construct.proxy;

/**
 * @author all
 * @since 2023/4/27 14:58
 */

public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("Train station sell tickets");
    }
}
