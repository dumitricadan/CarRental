package ro.jademy.carrental;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static Shop shop;

    public static void main(String[] args) {
        // Q: this is the main entry point of our program. What should we do here?

        shop = new Shop();
        boolean loggedIn = shop.login();
        if (loggedIn) {
            shop.showMenu();
        }
       //shop.sortbyPriceDescending();
    }

}
