package com.company;

/**
 * Created by dennisschmock on 07/02/2017.
 */
public class IPath<T> implements Path<T> {

    private T first;
    private Path<T> rest;



    public IPath(T first, Path<T> rest){
        this.first = first;
        this.rest = rest;
    }

    @Override
    public T getFirst() {
        return first;
    }

    @Override
    public Path<T> getRest() {
        return rest;
    }


}
