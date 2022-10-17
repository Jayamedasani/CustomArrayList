package org.example.implementation;

import org.example.controller.ObjectOperations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Arrays;
public class ArrayList implements ObjectOperations {
    private Logger logger= LoggerFactory.getLogger(ArrayList.class);
    private Object arrayList[];
    private int size;
    public ArrayList(Object o){
        arrayList=new Object[1];
        size=0;
    }
    public ArrayList(int n){
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
    public void delete(Object o) {
        int position=-1;
        for(int i=0;i<size;i++){
            if(arrayList[i].equals(o)){
                position=i;
            }
        }
        if(position==-1){
            logger.warn("Given Object is not available can't delete");
        }
        else{
            for(int i=position;i<size-1;i++){
                arrayList[i]=arrayList[i+1];
            }
            size--;
        }
    }

    @Override
    public Object get(int index) {
        if(index<0 || index>=size){
            logger.warn("Index out of bounds");
        }else{
            return arrayList[index];
        }
        return null;
    }

    @Override
    public void update(int index, Object o) {
        if(index<0 || index>=size){
            logger.warn("Index out of bounds");
        }
        else{
            arrayList[index]=o;
        }
    }

    @Override
    public void search(Object o) {
        int i;
        for(i=0;i<size;i++){
            if(o.equals(arrayList[i])){
                logger.info("Object Found");
                break;
            }
        }
        if(i==size){
            logger.info("Object Not Found");
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
}
