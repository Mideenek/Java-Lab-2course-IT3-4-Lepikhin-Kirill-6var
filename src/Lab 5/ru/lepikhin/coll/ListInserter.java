package ru.lepikhin.coll;

import java.util.ArrayList;
import java.util.List;

public class ListInserter {
    private final List<Integer> list;

    public ListInserter(List<Integer> list) {
        this.list = new ArrayList<>(list);
    }

    public List<Integer> getList() {
        return list;
    }


    public void insertAllAfterFirst(int e) {
        int index = list.indexOf(e);

        if (index < 0) {
            return;
        }

        List<Integer> copy = new ArrayList<>(list);
        list.addAll(index + 1, copy);
    }

    @Override
    public String toString() {
        return "список L: " + list;
    }
}