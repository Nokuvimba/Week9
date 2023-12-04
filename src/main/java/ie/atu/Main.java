package ie.atu;


public class Main {
    public static void main(String[] args) {
Person myPerson = new Person("Natty","Harare","911");
        System.out.println(myPerson.toString());
        Customer Part1 = new Customer("Natasha","Kadoma","+353","1",true);
        System.out.println(Part1.toString());
        Customer Part2 = new Customer();
        Part2.setName("Nokuvimba");
        Part2.setAddress("Galway");
        Part2.setTelephone("096546");
        Part2.setCustomerNumber("2");
        Part2.setMailingList(false);

        System.out.println("Name:"+Part2.getName());
        System.out.println("Address:"+Part2.getAddress());
        System.out.println("Telephone:"+Part2.getTelephone());
        System.out.println("CustomerNumber:"+Part2.getName());
        System.out.println("MailingList:"+Part2.isMailingList());
    }
}