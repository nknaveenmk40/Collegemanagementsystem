package com.cms.app.Collagemanagementsystem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Canteen")
public class CanteenEntity {

    @Column(name = "In_charge_id")
    private String inChargeId;

    @Column(name = "Items_list")
    private String itemsList;

    @Id
    @Column(name = "Available_list")
    private String availableList;

    public String getInChargeId() {
        return inChargeId;
    }

    public void setInChargeId(String inChargeId) {
        this.inChargeId = inChargeId;
    }

    public String getItemsList() {
        return itemsList;
    }

    public void setItemsList(String itemsList) {
        this.itemsList = itemsList;
    }

    public String getAvailableList() {
        return availableList;
    }

    public void setAvailableList(String availableList) {
        this.availableList = availableList;
    }
}
