package com.convertor.dto;

public class PersonDetails {

    private final String name;

    private final String address;

    private final String postcode;

    private final String phone;

    private final String creditLimit;

    private final String birthday;

    public PersonDetails(String name, String address, String postcode, String phone, String creditLimit, String birthday) {
        this.name = name;
        this.address = address;
        this.postcode = postcode;
        this.phone = phone;
        this.creditLimit = creditLimit;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getPhone() {
        return phone;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getBirthday() {
        return birthday;
    }
}
