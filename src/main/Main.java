package main;

import main.de.uni_hannover.task2.Marketplace;
import main.de.uni_hannover.task2.auth.User;
import main.de.uni_hannover.task2.offerings.Item;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Julia", "123test");
        user1.addItem(new Item("Seele", 5.00f, user1, "Geklaute Seele"));
        user1.addItem(new Item("Hosen", 150.00f, user1, "Gucci Hosen"));

        User user2 = new User("Andreas", "846912008");
        user2.addItem(new Item("PC", 1337.00f, user2, "Pc mit GT 730"));
        user2.addItem(new Item("Maus", 5.00f, user2, "Lebendiges Tier"));

        Marketplace marketplace = new Marketplace();
        marketplace.addUser(user1);
        marketplace.addUser(user2);

        System.out.println("Marktplatz:");
        System.out.println(marketplace.str());

        user1.getItems()[0].setPrice(1.00f);

        marketplace.removeUser(user2);

        System.out.println("Marktplatz:");
        System.out.println(marketplace.str());
    }
}
