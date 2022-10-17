package org.example.model;

import java.util.Objects;

public class Student {
    private int rollID;
    private String name,deptName,dob;

    public Student() {
    }

    public Student(int rollID, String name, String deptName, String dob) {
        this.rollID = rollID;
        this.name = name;
        this.deptName = deptName;
        this.dob = dob;
    }

    public int getRollID() {
        return rollID;
    }

    public void setRollID(int rollID) {
        this.rollID = rollID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollID == student.rollID && Objects.equals(name, student.name) && Objects.equals(deptName, student.deptName) && Objects.equals(dob, student.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollID, name, deptName, dob);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollID=" + rollID +
                ", name='" + name + '\'' +
                ", deptName='" + deptName + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
