package ro.jademy.carrental;

import ro.jademy.carrental.car.Car;
import ro.jademy.carrental.car.Engine;
import ro.jademy.carrental.car.FuelType;
import ro.jademy.carrental.car.audi.Afour;
import ro.jademy.carrental.car.audi.Asix;
import ro.jademy.carrental.car.audi.Qseven;
import ro.jademy.carrental.car.dacia.Duster;
import ro.jademy.carrental.car.dacia.Logan;
import ro.jademy.carrental.car.dacia.Sandero;
import ro.jademy.carrental.car.mercedes.Aclasse;
import ro.jademy.carrental.car.mercedes.Bclasse;
import ro.jademy.carrental.car.mercedes.Eclasse;

import java.math.BigDecimal;
import java.util.*;

public class Shop {
    // Q: what fields and methods should this class contain?
    private Scanner scan = new Scanner(System.in);

    private List<Salesman> salesmenList = new ArrayList<>();
    private List<Car> carList = new ArrayList<>();

    public Shop() {
        salesmenList.add(new Salesman("Popescu", "Vasile", "user1", "1111"));
        salesmenList.add(new Salesman("Ionescu", "Bogdan", "user2", "2222"));
        salesmenList.add(new Salesman("Stroe", "Ion", "user3", "3333"));

        carList.add(new Duster(2017, 5, "White", new Engine(FuelType.DIESEL, 1500, 150), new BigDecimal(500)));
        carList.add(new Logan(2018, 4, "Black", new Engine(FuelType.GASOLINE, 1400, 90), new BigDecimal(100)));
        carList.add(new Sandero(2018, 5, "Blue", new Engine(FuelType.DIESEL, 1500, 110), new BigDecimal(300)));
        carList.add(new Afour(2016, 4, "Red", new Engine(FuelType.GASOLINE, 1800, 180), new BigDecimal(600)));
        carList.add(new Asix(2017, 4, "Black", new Engine(FuelType.DIESEL, 2000, 180), new BigDecimal(700)));
        carList.add(new Qseven(2015, 5, "White", new Engine(FuelType.DIESEL, 2500, 200), new BigDecimal(1000)));
        carList.add(new Aclasse(2017, 5, "White", new Engine(FuelType.HYBRID, 1800, 150), new BigDecimal(500)));
        carList.add(new Bclasse(2018, 5, "Blue", new Engine(FuelType.GASOLINE, 1400, 130), new BigDecimal(400)));
        carList.add(new Eclasse(2018, 5, "Black", new Engine(FuelType.DIESEL, 2200, 200), new BigDecimal(900)));
        carList.add(new Afour(2017, 4, "White", new Engine(FuelType.DIESEL, 1600, 160), new BigDecimal(700)));
        carList.add(new Duster(2016, 5, "Red", new Engine(FuelType.GASOLINE, 1800, 150), new BigDecimal(400)));
        carList.add(new Sandero(2016, 5, "White", new Engine(FuelType.GASOLINE, 1400, 90), new BigDecimal(200)));

    }

    public boolean login() {
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
        System.out.println("6. Sort");
        System.out.println("7. Exit");

        System.out.println("Enter your option below:");
        int option = scan.nextInt();
        checkOption(option);
    }


    private void checkOption(int option) {
        switch (option) {
            case 1:
                listAllCars();
                showListMenuOptions();
                break;
            case 2:
                listAvailableCars();
                break;
            case 3:
                listRentedCars();
                break;
            case 6:
                sortMenu();
                break;

            default:
                System.out.println("Wrong option!");
                break;
        }
    }

    public void showListMenuOptions() {

        System.out.println("Select an action from below:");
        System.out.println("1. Filter by make");
        System.out.println("2. Filter by model");
        System.out.println("3. Filter by budget");
        // TODO: add additional filter methods based on car specs

        System.out.println("4. Back to previous menu");

        System.out.println();
        System.out.println("Enter your option below:");
        int option = scan.nextInt();
        checkSubMenuOption(option);
    }

    private void checkSubMenuOption(int option) {
        switch (option) {
            case 1:
                filterByMake();
                break;
            case 2:
                filterByModel();
                break;
            case 3:
                filterByBudget();
                break;
            case 4:
                showMenu();
                break;

            default:
                System.out.println("Wrong option!");
                break;
        }
    }

    public void listAllCars() {
        showHeader();
        for (Car car : carList) {
            car.showCarDetails();
        }
    }

    public void listAvailableCars() {
        showHeader();
        for (Car car : carList) {
            if (!car.getCarState().isRented()) {
                car.showCarDetails();
            }
        }
    }

    public void listRentedCars() {
        showHeader();
        for (Car car : carList) {
            if (car.getCarState().isRented()) {
                car.showCarDetails();
            }
        }
    }

    private void showHeader() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
        String header = String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s", "MAKE", "MODEL", "YEAR", "CAR TYPE", "DOOR NUMBER", "COLOR", "TRANSMITION", "CAPACITY", "HORSE POWER", "FUEL TYPE", "PRICE");
        System.out.println(header);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    private void filterByMake() {
        System.out.println("Enter the manufacturer:");
        String option = scan.next();
        List<Car> sublist = new ArrayList<>();
        for (Car car : carList) {
            if (car.getMake().equals(option)) {
                sublist.add(car);
            }
        }
        for (Car car : sublist) {
            car.showCarDetails();
        }
    }

    private void filterByModel() {
        System.out.println("Enter the model:");
        String option = scan.next();
        List<Car> sublist = new ArrayList<>();
        for (Car car : carList) {
            if (car.getModel().equals(option)) {
                sublist.add(car);
            }
        }
        for (Car car : sublist) {
            car.showCarDetails();
        }
    }

    private void filterByBudget() {
        System.out.println("Enter the price:");
        BigDecimal option = scan.nextBigDecimal();
        List<Car> sublist = new ArrayList<>();
        for (Car car : carList) {
            if (car.getBasePrice().equals(option)) {
                sublist.add(car);
            }
        }
        for (Car car : sublist) {
            car.showCarDetails();
        }
    }
    public void sortCarList() {
        List<Car> cars = new ArrayList<>(carList);
        Collections.sort(cars);
        for(Car car:cars) {
            car.showCarDetails();
        }
    }

    public void sortMenu() {

        System.out.println("1. Sort by make");
        System.out.println("2. Sort by model");
        System.out.println("3. Sort by budget ascending");
        System.out.println("4. Sort by budget descending");
        System.out.println("5. Back to previous menu");
        int option = scan.nextInt();
        sortMenuUserInput(option);
    }

    private void sortMenuUserInput(int option) {
        switch (option) {
            case 1:
                sortCarList();
                sortMenu();
                break;
            case 2:
                sortbyModel();
                sortMenu();
                break;
            case 3:
                sortbyPriceAscending();
                sortMenu();
                break;
            case 4:
                sortbyPriceDescending();
                sortMenu();
                break;
            case 5:
                showMenu();
                break;

            default:
                System.out.println("Wrong option!");
                break;
        }
    }

    public void sortbyModel() {
        List<Car> cars = new ArrayList<>(carList);
        Comparator<Car> modelComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getModel().compareTo(o2.getModel());
            }
        };
        Collections.sort(cars, modelComparator);
        for(Car car:cars) {
            car.showCarDetails();
        }
    }

    public void sortbyDoorNumber() {
        List<Car> cars = new ArrayList<>(carList);
        Comparator<Car> doorNumberComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getDoorNumber().compareTo(o2.getDoorNumber());
            }
        };
        Collections.sort(cars, doorNumberComparator);
        for(Car car:cars) {
            car.showCarDetails();
        }
    }

    public void sortbyEngine() {
        List<Car> cars = new ArrayList<>(carList);
        Comparator<Car> engineComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getEngine().compareTo(o2.getEngine());
            }
        };
        Collections.sort(cars, engineComparator);
        for(Car car:cars) {
            car.showCarDetails();
        }
    }

    public void sortbyPriceAscending() {
        List<Car> cars = new ArrayList<>(carList);
        Comparator<Car> priceComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getBasePrice().compareTo(o2.getBasePrice());
            }
        };
        Collections.sort(cars, priceComparator);
        for(Car car:cars) {
            car.showCarDetails();
        }
    }

    public void sortbyPriceDescending() {
        List<Car> cars = new ArrayList<>(carList);
        Comparator<Car> priceComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o2.getBasePrice().compareTo(o1.getBasePrice());
            }
        };
        Collections.sort(cars, priceComparator);
        for(Car car:cars) {
            car.showCarDetails();
        }
    }

    public void calculatePrice(int numberOfDays) {
        // TODO: apply a discount to the base price of a car based on the number of rental days
        // TODO: document the implemented discount algorithm

        // TODO: for a more difficult algorithm, change this method to include date intervals and take into account
        //       weekdays and national holidays in which the discount should be smaller

        // Q: what should be the return type of this method?
    }
}
