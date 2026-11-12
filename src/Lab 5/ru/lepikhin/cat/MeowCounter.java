package ru.lepikhin.cat;


public class MeowCounter implements Meower {
    private final Meower delegate;
    private int count = 0;

    public MeowCounter(Meower delegate) {
        this.delegate = delegate;
    }

    @Override
    public void meow() {
        delegate.meow();
        count++;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "счётчик мяуканий " + delegate;
    }
}