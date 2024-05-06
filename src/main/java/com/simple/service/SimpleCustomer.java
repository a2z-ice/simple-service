package com.simple.service;

import java.math.BigDecimal;

public class SimpleCustomer {
    private String customerId;
    private String customerFullName;
    private String customerPhone;
    private BigDecimal currentBalance;



    CustomerServiceInfo customerServiceInfo;

    public SimpleCustomer() {}
    public SimpleCustomer(String customerId, String customerFullName,
                          String customerPhone, BigDecimal currentBalance,
                          CustomerServiceInfo customerServiceInfo) {
        this.customerId = customerId;
        this.customerFullName = customerFullName;
        this.customerPhone = customerPhone;
        this.currentBalance = currentBalance;
        this.customerServiceInfo = customerServiceInfo;
    }

    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public String getCustomerFullName() {
        return customerFullName;
    }
    public void setCustomerFullName(String customerFullName) {
        this.customerFullName = customerFullName;
    }
    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }
    public void setCurrentBalance(BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }
    public String getCustomerPhone() {
        return customerPhone;
    }
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
    public CustomerServiceInfo getCustomerServiceInfo() {
        return customerServiceInfo;
    }

    public void setCustomerServiceInfo(CustomerServiceInfo customerServiceInfo) {
        this.customerServiceInfo = customerServiceInfo;
    }
}
