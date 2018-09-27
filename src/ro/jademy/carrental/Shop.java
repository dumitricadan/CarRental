package ro.jademy.carrental;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    // Q: what fields and methods should this class contain?
    private Scanner scan = new Scanner(System.in);

    private List<Salesman> salesmenList = new ArrayList<>();

    public Shop() {
        salesmenList.add(new Salesman("Popescu", "Vasile", "user1", "1111"));
        salesmenList.add(new Salesman("Ionescu", "Bogdan", "user2", "2222"));
        salesmenList.add(new Salesman("Stroe", "Ion", "user3", "3333"));
    }

    public boolean login() {

        // TODO: implement a basic user login

        String username = askUsername();
        for (Salesman salesman : salesmenList) {
            if (salesman.getUsername().equals(username)) {
                String password = askPassword();
                if (salesman.getPassword().equals(password)) {
                    System.out.println("Bine ai venit! " + salesman.getFirstname() + " " + salesman.getLastname());
                    return true;
                }
            }
        }

        System.out.println("Logare esuata!");
        return false;
    }

    private String askUsername() {
        System.out.println("Welcome! Enter your username:");
        String username = scan.nextLine();
        return username;
    }

    private String askPassword() {
        System.out.println("Welcome! Enter your password:");
        String password = scan.nextLine();
        return password;
    }

    public void showMenu() {

        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to the Jademy Car Rental Service   |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
        System.out.println("                    MAIN MENU                   ");
        System.out.println("1. List all cars");
        System.out.println("2. List available cars");
        System.out.println("3. List rented cars");
        System.out.println("4. Check income");
        System.out.println("5. Logout");
        System.out.println("6. Exit");
    }

    public void showListMenuOptions() {

        System.out.println("Select an action from below:");
        System.out.println("1. Filter by make");
        System.out.println("2. Filter by model");
        System.out.println("3. Filter by budget");
        // TODO: add additional filter methods based on car specs

        System.out.println("4. Back to previous menu");

    }

    public void calculatePrice(int numberOfDays) {
        // TODO: apply a discount to the base price of a car based on the number of rental days
        // TODO: document the implemented discount algorithm

        // TODO: for a more difficult algorithm, change this method to include date intervals and take into account
        //       weekdays and national holidays in which the discount should be smaller

        // Q: what should be the return type of this method?
    }
}
