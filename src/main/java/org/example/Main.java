package org.example;

import org.example.implementation.ArrayList;
import org.example.model.Employee;
import org.example.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        Logger logger= LoggerFactory.getLogger(Main.class);
        Student student=new Student();
        Employee employee=new Employee();
        ArrayList studentList=new ArrayList(student);
        studentList.add(new Student(101,"Jaya","CSE","08-03-2001"));
        studentList.display();
        logger.info("Student Size:"+studentList.size());
        ArrayList employeeList=new ArrayList(employee);
        employeeList.add(new Employee(103,"Jaya","Khammam"));
        employeeList.display();
        logger.info("Employee Size:"+employeeList.size());
        Object employee1=new Employee();
        employee1=employeeList.get(0);
        logger.info("Employee details by GET method:"+employee1);
        Object student1=new Student();
        employee1=studentList.get(0);
        logger.info("Student details by GET method:"+student1);
        employeeList.update(0,new Employee(103,"Anu","Hyd"));
        employeeList.display();
    }
}