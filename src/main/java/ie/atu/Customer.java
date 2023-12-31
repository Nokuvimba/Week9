package ie.atu;

public class Customer extends Person {
    private String customerNumber;
    private boolean mailingList;

    public Customer() {

    }

    public Customer(String name, String address, String telephone, String customerNumber, boolean mailingList) {
        super(name, address, telephone);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    @Override
    public String toString() {
        return "Customer" + super.toString()+
                "customerNumber='" + customerNumber + '\'' +
                ", mailingList=" + mailingList;
    }
}
