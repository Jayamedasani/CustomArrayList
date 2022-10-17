package org.example.model;

import java.util.Objects;

public class Employee {
    private int rollId;
    private String name,address;

    public Employee() {
    }

    public Employee(int rollId, String name, String address) {
        this.rollId = rollId;
        this.name = name;
        this.address = address;
    }

    public int getRollId() {
        return rollId;
    }

    public void setRollId(int rollId) {
        this.rollId = rollId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return rollId == employee.rollId && Objects.equals(name, employee.name) && Objects.equals(address, employee.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollId, name, address);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "rollId=" + rollId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
