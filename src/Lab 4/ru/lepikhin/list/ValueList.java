package ru.lepikhin.list;

public class ValueList<T> {
    private final T[] values;

    @SafeVarargs
    public ValueList(T... values) {
        this.values = values.clone();
    }

    public ValueList(ValueList<T> other) {
        this.values = other.values.clone();
    }

    @SuppressWarnings("unchecked")
    public ValueList(int size) {
        this.values = (T[]) new Object[size];
    }

    public T get(int n) {
        checkIndex(n);
        return values[n];
    }

    public void set(int n, T newValue) {
        checkIndex(n);
        values[n] = newValue;
    }

    public boolean isEmpty() {
        return values.length == 0;
    }

    public int size() {
        return values.length;
    }

    public T[] toArray() {
        return values.clone();
    }

    private void checkIndex(int n) {
        if (n < 0 || n >= values.length) {
            throw new IndexOutOfBoundsException(
                    "Позиция " + n + " вне диапазона 0.." + (values.length - 1));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < values.length; i++) {
            sb.append(values[i]);

            if (i < values.length - 1) {
                sb.append(", ");
            }
        }

        return sb.append("]").toString();
    }
}