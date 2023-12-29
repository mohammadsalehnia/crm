package model;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Customer {
    private final CustomerType type;
    private static final AtomicInteger nextId = new AtomicInteger(1);
    private ArrayList<Contact> contacts = new ArrayList<>();

    private int id;
    private String name;
    private String address;

    protected Customer(String name, CustomerType type) {
        this.id = nextId.getAndIncrement();
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerType getType() {
        return type;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

}