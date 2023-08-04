/*
 * Copyright (c) 2023. ALL.
 */

package behavior.mediator;

/**
 * @author all
 * @since 2023/7/30 3:20
 */

public class Client {
    public static void main(String[] args) {
        Agent mediator = new Agent();

        Tenant tenant = new Tenant("LiSi", mediator);
        HouseOwner houseOwner = new HouseOwner("ZhangSan", mediator);

        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);

        tenant.contact("I would like to rent a three bedroom house.");
        houseOwner.contact("I happen to have one. Do you want t rent it.");
    }
}
