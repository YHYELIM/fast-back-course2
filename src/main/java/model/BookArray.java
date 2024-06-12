package model;

import java.util.Arrays;

public class BookArray {
    private final int DEFAULT_CAPACITY = 5; //수정 불가 (final)
    private  Book[] elements;
    private int size =0;

    //생성 동작
    public BookArray(){
        elements = new Book[DEFAULT_CAPACITY]; //5개 크기 배열
    }

    //저장하는 동작
    public void add (Book element){
        if(size == elements.length){
            ensureCapacity();
        }

        elements[size++] = element;
    }

    //얻는 동작
    public Book get(int index){
        return elements[index];
    }

    //원소의 개수를 넘겨주는 동작
    public  int size(){
        return  size;
    }

    public void ensureCapacity(){
        int newCapacity = elements.length*2;
        elements = Arrays.copyOf(elements, newCapacity); //기존의 elelments 배열을 copy 나머지는 비어져있음

    }
}
