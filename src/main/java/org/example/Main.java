package org.example;

import org.example.exception.IndexOutOfBoundsException;
import org.example.exception.ObjectNotFoundException;
import org.example.implementation.ArrayList;
import org.example.model.Employee;
import org.example.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) throws IndexOutOfBoundsException, ObjectNotFoundException {
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
        employeeList.delete(new Employee(103,"Anu","Hyd"));
        employeeList.display();
        boolean isEmployeeEmpty=employeeList.isEmpty();
        if(isEmployeeEmpty){
            logger.info("Employee List is Empty");
        }
        else {
            logger.info("Employee List is not Empty");
        }
        ArrayList integerList=new ArrayList(10);
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.display();
        boolean isIntegerEmpty=integerList.isEmpty();
        if(isIntegerEmpty){
            logger.info("Integer List is Empty");
        }
        else {
            logger.info("Integer List is not Empty");
        }
        integerList.search(20);
        /*integerList.clear();*/
        integerList.display();
        int index=integerList.indexOf(20);
        logger.info("index of 20 is:"+index);
        int jayaindex=studentList.indexOf(new Student(101,"Jaya","CSE","08-03-2001"));
        logger.info("Jaya index is:"+jayaindex);
        studentList.replace(new Student(101,"Jaya","CSE","08-03-2001"),new Student(101,"Jayalakshmi","CSE","08-03-2001"));
        studentList.display();

    }
}