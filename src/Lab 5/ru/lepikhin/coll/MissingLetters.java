package ru.lepikhin.coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;
import java.util.TreeSet;

public class MissingLetters {
    private final String text;
    private final Set<Character> used = new TreeSet<>();

    public MissingLetters(String filePath) throws IOException {
        this.text = String.join(" ", Files.readAllLines(Paths.get(filePath))).toLowerCase();

        for (char c : text.toCharArray()) {
            if (c >= 'а' && c <= 'я' || c == 'ё') {
                used.add(c);
            }
        }
    }


    public Set<Character> missing() {
        Set<Character> alphabet = new TreeSet<>();

        for (char c = 'а'; c <= 'я'; c++) {
            alphabet.add(c);
        }
        alphabet.add('ё');

        alphabet.removeAll(used);
        return alphabet;
    }

    @Override
    public String toString() {
        return "текст: \"" + text + "\"";
    }
}