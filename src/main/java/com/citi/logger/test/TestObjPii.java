package com.citi.logger.test;

public class TestObjPii {

    private String customerName;

    public TestObjPii(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TestObjPii{");
        sb.append("customerName='").append(customerName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
