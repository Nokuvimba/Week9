package ie.atu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Person myPerson = new Person("Natty","Harare","911");
        System.out.println(myPerson.toString());
        Customer myCustomer= new Customer("Noku","Mutare","+263","Fifi",true);
        System.out.println(myCustomer.toString());
        Scanner keyboard= new Scanner(System.in);

    }
}