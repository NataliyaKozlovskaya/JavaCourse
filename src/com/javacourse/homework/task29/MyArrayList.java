package com.javacourse.homework.task29;

import java.util.ArrayList;
import java.util.Arrays;

//public class MyArrayList<T> {
//
//    private T[] array;
//    int capacity = 5;
//    private int cursor = 0;
//
//    public MyArrayList(T[] array) {
//        this.array = array;
//    }
//
//    public MyArrayList() {
//        array = (T[]) new Object[capacity];
//    }
//
//    public void add(T elem) {
//        if (cursor>=array.length) {
//            T[] newarray = Arrays.copyOf(array, array.length * 2);
//            array = newarray;
//        }
//        array[cursor] = elem;
//        cursor++;
//    }
//
//    public T get(int index) throws IndexOutOfBoundsException {
//        if (index > cursor-1) {
//            String errorMessage = "Индекс превышает длину массива";
//            throw new IndexOutOfBoundsException(errorMessage);
//        }
//        return array[index];
//    }
//
//    public void remove(int index) throws IndexOutOfBoundsException {
//        if (index > cursor) {
//            String errorMessage = "Индекс превышает длину массива";
//            throw new IndexOutOfBoundsException(errorMessage);
//        }else {
//            for (int i = index; i < array.length-1; i++) {
//                array[i] = array[i+1];
//            }
//            cursor--;
//        }
//    }
//
//    public int size() {
//        return cursor;
//    }
//}
//

public class MyArrayList <T> {
    private T [] array;
    private int capacity = 10;
    private int cursor = 0;
    private int index = 0;

    public MyArrayList(T[] array) {
        this.array = array;
    }

    public MyArrayList() {
        array = (T[]) new Object [capacity];
    }

    public void add(T elem){
        if (cursor>=array.length){
            T[] newarray = Arrays.copyOf(array, array.length*2);
            array=newarray;
        }else {
            array[cursor] = elem;
            index++;
        }
    }

    public T get(int index) throws IndexOutOfBoundsException{
        if (index>=cursor){
            String s = "неверный индекс элмента";
            throw new IndexOutOfBoundsException(s);
        }else {
            return array[index];
        }
    }

    public void remove(int index) throws IndexOutOfBoundsException{
        if (index>=cursor){
            String errorMessage = " неверный индекс";
            throw new IndexOutOfBoundsException(errorMessage);
        }else {
            for (int i = index; i<=array.length-1; i++){
                array[i] = array[i+1];
            }
            cursor--;
        }
    }

    public int size(){
        return cursor;
    }

}
