package com.company;

public class ListeP<T> {
    private final T[] element;
    int lastIndex;
    int firstIndex;
    int current_size;
    public static void main(String[] args) {
        ListeP<Integer> l = new ListeP<Integer>(5);
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(6);
        //l.insert(7);
        l.remove();
        l.insert(6);

        System.out.println(l);
    }
    public ListeP (int len){
        element = (T[]) new Object[len];
        lastIndex = len;
        firstIndex = 0;
        current_size = 0;
    }

    public void insert(T o){
        //ist platz frei
        if (current_size >= element.length){
            throw new RuntimeException("list is full, idiot");
        } else {
            if (lastIndex >= element.length){
                lastIndex = 0;
            }
            element[lastIndex] = o;
            lastIndex++;
        }
        //increase current size
        current_size++;

    }

    public void remove(){
        element[firstIndex] = null;
        firstIndex++;
        if (firstIndex >= element.length){
            firstIndex = 0;
        }
        current_size--;
    }
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder("(  ");
        for (T t : element) {
            s.append(t).append("  ");
        }
        s.append(")");
        return s.toString();
    }
}
