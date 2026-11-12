package ru.lepikhin.generic;


public interface Adder<P, T> {
    void add(P target, T value);
}