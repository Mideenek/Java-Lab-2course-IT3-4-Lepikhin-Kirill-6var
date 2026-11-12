package ru.lepikhin.generic;

public interface Reducer<T> {
    T reduce(T current, T item);
}