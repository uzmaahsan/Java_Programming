package day48_constructor_Static;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1.toString());
        cs1.getId(1);
        cs1.getName("Bob");
        System.out.println(cs1);
    }
}
