package android.com.pulltorefreshexample;


public class Customer {

    private String customerId;
    private String customerName;
    private String customerPhoneNumber;


    public Customer(String customerId, String customerName, String customerPhoneNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }
}