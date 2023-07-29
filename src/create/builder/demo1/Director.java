package create.builder.demo1;

/**
 * @author all
 * @since 2023/7/18 15:59
 */

public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        builder.builderFrame();
        builder.builderSeat();
        return builder.createBike();
    }
}
