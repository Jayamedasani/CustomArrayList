package org.example.controller;

public interface ObjectOperations {
    public void add(Object o);
    public void delete(Object o);
    public Object get(int index);
    public void update(int index,Object o);
    public void search(Object o);
    public void display();
    public int size();
}
