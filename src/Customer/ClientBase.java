package Customer;

import java.util.*;

public class ClientBase {
    private List<Customer> customers;

    public ClientBase() {
        customers = new ArrayList<Customer>();
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public void add(Customer cust) {
        customers.add(cust);
    }

    public List<Customer> sortBylastName() {
        List<Customer> result = new ArrayList<>(customers);
        result.sort((o1, o2) -> o1.getLastName().compareToIgnoreCase(o2.getLastName()));
        return result;
    }

    public List<Customer> getListByDiapasonCreaditCard(int diapazonStart, int diapazonEnd) {
        List<Customer> result = new ArrayList<>();
        for (Customer c : customers) {
            if (c.getCreditCard() >= diapazonStart && c.getCreditCard() <=diapazonEnd) {
                result.add(c);
            }
        }
        return result;
    }

}