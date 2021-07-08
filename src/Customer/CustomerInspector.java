package Customer;

import java.util.List;

public class CustomerInspector {
    public static void main(String[] args) {
        ClientBase base = new ClientBase();

        base.add(new Customer("Ivanov", "Ivan", 1000));
        base.add(new Customer("Smirnov", "Petr", 1500));
        base.add(new Customer("Vasiliev", "Vasil", 2000));
        base.add(new Customer("Ignatov", "Ignat", 2500));
        base.add(new Customer("Miromov", "Miron", 3500));
        base.add(new Customer("Aleksiev", "Aleksei", 4500));
        base.add(new Customer("Dmitrov", "Dmitry", 5500));

        System.out.println("\nSort by last Name:");
        List<Customer> listSortByLastName = base.sortBylastName();
        for (Customer c : listSortByLastName) {
            System.out.println(c);
        }

        System.out.println("\nCustomers with diapason credit card from 2100 till 5000:");
        List<Customer> listSortByDiapazonCreditCard = base.getListByDiapasonCreaditCard(2100, 5000);
        for (Customer c : listSortByDiapazonCreditCard) {
            System.out.println(c);
        }
    }
}