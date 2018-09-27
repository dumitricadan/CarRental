package ro.jademy.carrental;

public abstract class Person {
    protected String firstname;
    protected String lastname;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void showName() {
        System.out.println(firstname + " " + lastname);
    }
}
