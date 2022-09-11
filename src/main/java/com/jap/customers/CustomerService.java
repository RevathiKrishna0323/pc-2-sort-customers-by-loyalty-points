package com.jap.customers;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CustomerService {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(10, "Abhishek", "Male", false, "Indore", 240));
        customerList.add(new Customer(11, "Vaibhav", "Male", false, "Indore", 180));
        customerList.add(new Customer(12, "Diwakar", "Male", false, "Indore", 200));


        System.out.println(customerService.getListOfCustomersSortedByLoyaltyPoints(customerList, new LoyaltyPointComparator()));
    }

    // This method returns the customer's loyalty points in sorted order
    public List<Integer> getListOfCustomersSortedByLoyaltyPoints(List<Customer> customerList, LoyaltyPointComparator loyaltyPointComparator) {
        List<Integer> integerList = new ArrayList<>();
        Collections.sort(customerList, loyaltyPointComparator);
        Iterator<Customer> iterator = customerList.iterator();
        while (iterator.hasNext()) {
            integerList.add(iterator.next().getLoyaltyPoints());
        }
        return integerList;
    }

}