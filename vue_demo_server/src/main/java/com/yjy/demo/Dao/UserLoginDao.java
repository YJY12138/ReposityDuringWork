package com.yjy.demo.Dao;

public class UserLoginDao<K,E> implements SimpleTableDao<K,E> {


    @Override
    public E insert(E entity) {
        return null;
    }

    @Override
    public int delete(K key) {
        return 0;
    }

    @Override
    public E queryByPrimeKey(K key) {
        return null;
    }

    @Override
    public E updateByPrimeKey(E entity) {
        return null;
    }
}
