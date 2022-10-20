package org.example.implementation;

import org.example.comparator.ObjectComparator;
import org.example.controller.ObjectOperations;
import org.example.exception.IndexOutOfBoundsException;
import org.example.exception.ObjectNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayList implements ObjectOperations {
    private Logger logger= LoggerFactory.getLogger(ArrayList.class);
    private Object arrayList[];

    private int size;
    public ArrayList(Object o){
        arrayList=new Object[1];
        size=0;
    }
    public ArrayList(Object o,int n){
        arrayList=new Object[n];
        size=0;
    }
    @Override
    public void add(Object o) {
        if(size==arrayList.length){
            addSize();
        }
        arrayList[size++]=o;
    }

    private void addSize() {
        arrayList= Arrays.copyOf(arrayList,size+50);
    }

    @Override
    public void delete(Object o) throws ObjectNotFoundException {
        int position=-1;
        for(int i=0;i<size;i++){
            if(arrayList[i].equals(o)){
                position=i;
            }
        }
        if(position==-1){
            throw new ObjectNotFoundException("Object Not found can't delete");
        }
        else{
            for(int i=position;i<size-1;i++){
                arrayList[i]=arrayList[i+1];
            }
            size--;
        }
    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("Index is out of bounds can't find");
        }else{
            return arrayList[index];
        }
    }

    @Override
    public void update(int index, Object o) throws IndexOutOfBoundsException {
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("Index is out of bounds can't update");
        }
        else{
            arrayList[index]=o;
        }
    }

    @Override
    public void search(Object o) throws ObjectNotFoundException {
        int i;
        for(i=0;i<size;i++){
            if(o.equals(arrayList[i])){
                logger.info("Object Found");
                break;
            }
        }
        if(i==size){
            throw new ObjectNotFoundException("Object Not Found");
        }
    }

    @Override
    public void display() {
        if(size==0){
            logger.info("List is empty");
        }
        else {
            for (int i = 0; i < size; i++) {
                logger.info("List element "+(i+1)+" "+ arrayList[i]);
            }
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if(size==0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void clear() {
        for(int i=0;i<size;i++){
            arrayList[i]=null;
        }
        size=0;
    }

    @Override
    public int indexOf(Object o) throws ObjectNotFoundException {
        int i;
        for(i=0;i<size;i++){
            if(o.equals(arrayList[i])){
                break;
            }
        }
        if(i==size){
            throw new ObjectNotFoundException("Object Not found");
        }
        return i;
    }

    @Override
    public void replace(Object existingObject, Object updatedObject) throws ObjectNotFoundException {
        int i;
        for( i=0;i<size;i++){
            if(existingObject.equals(arrayList[i])){
                arrayList[i]=updatedObject;
                logger.info("Object Updated");
            }
        }
        if(i==size){
            throw new ObjectNotFoundException("Object not found Can't replace");
        }
    }

    @Override
    public boolean contains(Object o) {
        for (int i=0;i<size;i++){
            if(o.equals(arrayList[i])){
                return true;
            }
        }
        return false;
    }

    @Override
    public Object[] subList(int startIndex, int lastIndex) throws IndexOutOfBoundsException {
        if(startIndex<0 || lastIndex>=size){
            throw new IndexOutOfBoundsException("Index values out of bound");
        }
        else{
            int j=-1;
            int n=lastIndex-startIndex;
            Object subList[]=new Object[n];
            for(int i=startIndex;i<=lastIndex;i++){
                subList[j++]=arrayList[i];
            }
            return subList;
        }
    }

    @Override
    public Object[] sort() {
        Arrays.sort(arrayList, (Comparator) new ObjectComparator());
        return arrayList;
    }

    @Override
    public Object forEach() {
        int i=0;
        while(i<size){
            try{
                return arrayList[i];
            }
            finally {
                i++;
                while(i<size){}
            }
        }
        return null;
    }

}
