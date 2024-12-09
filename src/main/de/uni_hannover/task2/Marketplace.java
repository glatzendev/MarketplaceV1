package main.de.uni_hannover.task2;

import main.de.uni_hannover.task2.auth.User;
import main.de.uni_hannover.task2.offerings.Item;

public class Marketplace {
    private User[] users = new User[10];
    private int usersCount = 0;

    //Constructor
    public Marketplace() {
    }

    //Getter
    public User[] getUsers() {
        return users;
    }

    //Add User
    public boolean addUser(User user) {
        if (usersCount < 10) {
            users[usersCount] = user;
            usersCount++;
            return true;
        } else {
            return false;
        }
    }

    //Remove User
    public boolean removeUser(User user) {
        for (int i = 0; i < usersCount; i++) {
            if (users[i] == user) {
                for (int j = i; j < usersCount - 1; j++) {
                    users[j] = users[j + 1];
                }
                users[usersCount - 1] = null;
                usersCount--;
                return true;
            }
        }
        return false;
    }

    
    public String str() {
        String str = "";
        for (User user : users) {
            if (user != null) {
                for (Item item : user.getItems()) {
                    if (item != null) {
                        str += item.str() + "\n";
                    }
                }
            }
        }
        return str;
    }
    
}
