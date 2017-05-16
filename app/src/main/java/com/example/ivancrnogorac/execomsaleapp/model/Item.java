package com.example.ivancrnogorac.execomsaleapp.model;

/**
 * Created by Ivan Crnogorac on 5/16/2017.
 */

public class Item {

    private String itemName;
    private String itemPrice;
    private String itemAmount;
    private User itemUser;

    public Item() {
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemAmmount() {
        return itemAmount;
    }

    public void setItemAmmount(String itemAmmount) {
        this.itemAmount = itemAmmount;
    }

    public User getItemUser() {
        return itemUser;
    }

    public void setItemUser(User itemUser) {
        this.itemUser = itemUser;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", itemPrice='" + itemPrice + '\'' +
                ", itemAmount='" + itemAmount + '\'' +
                ", itemUser=" + itemUser +
                '}';
    }
}
