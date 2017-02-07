package com.company;

/**
 * Created by dennisschmock on 07/02/2017.
 */
public class PathStack<T> {


    private Path<T> data;

    public PathStack() {
        data = new IPath<T>(null,null);
    }

    public void push(T element) {

        data = new IPath(element, data);
    }

    public T pop() {
        T element = data.getFirst();
        data = data.getRest();
        return element;
    }

    public boolean isEmpty() {
        return data.getFirst()==null;
    }


}
