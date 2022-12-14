package org.example.controller;

import org.example.exception.IndexOutOfBoundsException;
import org.example.exception.ObjectNotFoundException;
import org.example.functionalinterface.ListDisplay;
import org.example.implementation.ArrayList;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.function.Consumer;

public interface ObjectOperations {
    public void add(Object o);
    public void delete(Object o) throws ObjectNotFoundException;
    public Object get(int index) throws IndexOutOfBoundsException;
    public void update(int index,Object o) throws IndexOutOfBoundsException;
    public void search(Object o) throws ObjectNotFoundException;
    public void display();
    public int size();
    public boolean isEmpty();
    public void clear();
    public int indexOf(Object o) throws ObjectNotFoundException;
    public void replace(Object existingObject,Object updatedObject) throws ObjectNotFoundException;
    public boolean contains(Object o);
    public Object[] subList(int startIndex,int lastIndex) throws IndexOutOfBoundsException;
    public Object[] sort();
    void forEach(ListDisplay<Object> action);

    public void writeListObject();
}
