package ru.lepikhin.generic;

import java.util.List;

import ru.lepikhin.list.ValueList;

public class ListOps {
    public static void fillHundred(List<? super Integer> list) {
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
    }

    public static void fillHundred(ValueList<? super Integer> list) {
        for (int i = 1; i <= 100; i++) {
            list.set(i - 1, i);
        }
    }
}