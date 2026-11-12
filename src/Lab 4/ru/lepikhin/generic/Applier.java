package ru.lepikhin.generic;


public interface Applier<T, P> {
    P apply(T value);
}