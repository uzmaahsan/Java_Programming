package day48_constructor_Static;

public class Customer {
    private String name;
    private int id;

    //No-Args Constructor.
    public Customer() {
        System.out.println("No-args constructor");
        name = "new customer";
        id = -1;
    }

    //add a Constructor with params where we can assign name and id
    public Customer(String name, int id) {
        System.out.println("2-args constructor");
        this.name = name; //setName(name);
        this.id = id;     //setId(id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //condition
        this.name = name;
    }

    public int getId(int i) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void getName(String bob) {
    }
}