// Base class Person
public abstract class Person {
    private String name;

    // Constructor to initialize the name
    public Person(String name) {
        this.name = name;
    }

    // Getter for the name
    public String getName() {
        return name;
    }

    // Setter for the name
    public void setName(String name) {
        this.name = name;
    }
}