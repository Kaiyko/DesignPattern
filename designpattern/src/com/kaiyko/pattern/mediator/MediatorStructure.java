package com.kaiyko.pattern.mediator;

/**
 * 具体的中介者角色类
 */
public class MediatorStructure extends Mediator {

    //  聚合房主和租房者对象
    private HouseOwner houseOwner;
    private Tenant tenant;

    @Override
    public void contract(String message, Person person) {
        if (person == houseOwner) {
            tenant.getMessage(message);
        } else {
            houseOwner.getMessage(message);
        }
    }

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
}
