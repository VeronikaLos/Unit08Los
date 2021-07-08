package Customer;

import java.util.Objects;

public class Customer {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private int creditCard;
    private int bankAccount;

    public Customer (String lastName, String firstName, int creditCard) {
        this.lastName=lastName;
        this.firstName=firstName;
        this.creditCard=creditCard;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return getCreditCard() == customer.getCreditCard() && getLastName().equals(customer.getLastName()) && getFirstName().equals(customer.getFirstName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLastName(), getFirstName(), getCreditCard());
    }

    @Override
    public String toString() {
        return "Customer [LastName=" + lastName + ", FirstName=" + firstName + ", CreditCard=" + creditCard + "]";
    }

}