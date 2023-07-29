package create.builder.demo1;

/**
 * @author all
 * @since 2023/7/18 15:58
 */

public class OfoBuilder extends Builder{
    @Override
    public void builderFrame() {
        bike.setFrame("Ofo_frame");
    }

    @Override
    public void builderSeat() {
        bike.setSeat("Ofo_seat");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
