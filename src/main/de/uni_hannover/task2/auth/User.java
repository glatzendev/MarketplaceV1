package main.de.uni_hannover.task2.auth;

import main.de.uni_hannover.task2.offerings.Item;

public class User {
    String username = "";
    String password = "";
    Item[] items = new Item[10];

    //Constructor
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //Getter
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Item[] getItems() {
        return items;
    }

    //Setter
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Remove Items
    public boolean removeItem(Item item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == item) {
                items[i] = null;
                return true;
            }
        }
        return false;
    }

    //Add Items
    public boolean addItem(Item item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }
    
    //String represantaion  
    public String str() {
        return "[User: " + username + "; Password: " + password + "]";
    }
}