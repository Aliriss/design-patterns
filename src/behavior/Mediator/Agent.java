/*
 * Copyright (c) 2023. ALL.
 */

package behavior.Mediator;


/**
 * 中介者角色类
 * @author all
 * @since 2023/7/30 3:18
 */

public class Agent extends Mediator {

    private HouseOwner houseOwner;
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    /**
     * 沟通
     *
     * @param msg    信息
     * @param person 人
     */
    @Override
    public void contact(String msg, Person person) {
        if (person == houseOwner) {
            tenant.getMsg(msg);
        } else {
            houseOwner.getMsg(msg);
        }
    }
}
