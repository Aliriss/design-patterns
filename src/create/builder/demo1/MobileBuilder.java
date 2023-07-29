package create.builder.demo1;

/**
 * @author all
 * @since 2023/7/18 15:54
 */

public class MobileBuilder extends Builder{

    @Override
    public void builderFrame() {
        bike.setFrame("Mobile_frame");
    }

    @Override
    public void builderSeat() {
        bike.setSeat("HMobile_seat");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
