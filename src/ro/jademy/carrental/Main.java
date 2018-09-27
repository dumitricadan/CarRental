package ro.jademy.carrental;

public class Main {

    public static void main(String[] args) {
        // Q: this is the main entry point of our program. What should we do here?

        Salesman s1 = new Salesman("Popescu", "Vasile");
        s1.showName();
        Person s2 = new Salesman("Vasile", "Iulian");
        s2.showName();
    }
}
