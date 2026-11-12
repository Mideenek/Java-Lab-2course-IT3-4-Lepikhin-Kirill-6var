package ru.lepikhin.coll;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class QueueBuilder<T> {
    private final List<T> list;

    public QueueBuilder(List<T> list) {
        this.list = new ArrayList<>(list);
    }

    public List<T> getList() {
        return list;
    }


    public Queue<T> build() {
        Queue<T> queue = new ArrayDeque<>();

        for (T item : list) {
            queue.add(item);
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            queue.add(list.get(i));
        }

        return queue;
    }

    @Override
    public String toString() {
        return "исходный список: " + list;
    }
}