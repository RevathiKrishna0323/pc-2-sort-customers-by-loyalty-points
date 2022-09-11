package com.jap.customers;

import java.util.Objects;

public class Customer {
    private int customerId;
    private String customerName;
    private String customerGender;
    private boolean isSeniorCitizen;
    private String city;
    private int loyaltyPoints;

    public Customer(int customerId, String customerName, String customerGender, boolean isSeniorCitizen, String city, int loyaltyPoints) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerGender = customerGender;
        this.isSeniorCitizen = isSeniorCitizen;
        this.city = city;
        this.loyaltyPoints = loyaltyPoints;
    }

    // generate getters and setters
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public boolean isSeniorCitizen() {
        return isSeniorCitizen;
    }

    public void setSeniorCitizen(boolean seniorCitizen) {
        isSeniorCitizen = seniorCitizen;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }
    // generate toString()

    @Override
    public String toString() {
        return "Customer{" + "customerId=" + customerId + ", customerName='" + customerName + '\'' + ", customerGender='" + customerGender + '\'' + ", isSeniorCitizen=" + isSeniorCitizen + ", city='" + city + '\'' + ", loyaltyPoints=" + loyaltyPoints + '}';
    }

    // override equals() and hashcode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customerId == customer.customerId && isSeniorCitizen == customer.isSeniorCitizen && loyaltyPoints == customer.loyaltyPoints && Objects.equals(customerName, customer.customerName) && Objects.equals(customerGender, customer.customerGender) && Objects.equals(city, customer.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, customerName, customerGender, isSeniorCitizen, city, loyaltyPoints);
    }
}

