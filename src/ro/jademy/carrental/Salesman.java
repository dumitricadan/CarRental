package ro.jademy.carrental;

public class Salesman extends Person implements Comparable<Salesman> {

    // Q: how can we avoid duplicate code in the salesman and the customer classes?

    private String username;
    private String password;

    public Salesman(String firstname, String lastname, String username, String password) {
        super(firstname, lastname);
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void showName() {
        System.out.println("Polimorfism");
    }

    @Override
    public int compareTo(Salesman o) {
        return 0;
    }
}
