package main.de.uni_hannover.task2.offerings;

import main.de.uni_hannover.task2.auth.User;

public class Item {
    private String name;
    private float price;
    private User seller;
    private String description;

    //Constructor
    public Item(String name, float price, User seller, String description) {
        this.name = name;
        this.price = price;
        this.seller = seller;
        this.description = description;
    }

    //Getter
    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public User getSeller() {
        return seller;
    }

    public String getDescription() {
        return description;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //String represantaion
    public String str() {
        return "[Item: " + name + "; Preis: " + price + "; Verkäufer: " + seller.getUsername() + "; Beschreibung: " + description + "]";
    }
    
}
