package com.company;

/**
 * Created by dennisschmock on 07/02/2017.
 */
public interface Path<T> {

        T getFirst();
        Path<T> getRest();

}
