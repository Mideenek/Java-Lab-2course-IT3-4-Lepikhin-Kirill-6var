package ru.lepikhin.list;

public class ImmutableValueList {
    private final int[] values;

    public ImmutableValueList(int... values) {
        this.values = values.clone();
    }

    public ImmutableValueList(ImmutableValueList other) {
        this.values = other.values.clone();
    }

    public int get(int n) {
        checkIndex(n);
        return values[n];
    }

    public void set(int n, int newValue) {
        checkIndex(n);
        values[n] = newValue;
    }

    public boolean isEmpty() {
        return values.length == 0;
    }

    public int size() {
        return values.length;
    }

    public int[] toArray() {
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