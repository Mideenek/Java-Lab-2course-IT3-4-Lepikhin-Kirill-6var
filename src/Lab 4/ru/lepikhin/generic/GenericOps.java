package ru.lepikhin.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericOps {
    // 3.1: применяет apply к каждому элементу, возвращает новый список типа P
    public static <T, P> List<P> map(List<T> source, Applier<T, P> applier) {
        List<P> result = new ArrayList<>();

        for (T item : source) {
            result.add(applier.apply(item));
        }

        return result;
    }

    // 3.2: возвращает новый список только из элементов, прошедших test
    public static <T> List<T> filter(List<T> source, Tester<T> tester) {
        List<T> result = new ArrayList<>();

        for (T item : source) {
            if (tester.test(item)) {
                result.add(item);
            }
        }

        return result;
    }

    // 3.3: сводит список к одному значению; emptyValue гарантирует,
    // что на пустом списке метод не вернёт null и не бросит ошибку
    public static <T> T reduce(List<T> source, Reducer<T> reducer, T emptyValue) {
        T result = emptyValue;

        for (T item : source) {
            result = reducer.reduce(result, item);
        }

        return result;
    }

    // 3.4: создаёт коллекцию через creator и переносит в неё значения через adder
    public static <T, P> P collect(List<T> source, Creator<P> creator, Adder<P, T> adder) {
        P result = creator.create();

        for (T item : source) {
            adder.add(result, item);
        }

        return result;
    }
}