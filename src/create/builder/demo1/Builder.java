package create.builder.demo1;

/**
 * @author all
 * @since 2023/7/18 15:51
 */

public abstract class Builder {
    protected Bike bike = new Bike();

    public abstract void builderFrame();
    public abstract void builderSeat();
    public abstract Bike createBike();
}
