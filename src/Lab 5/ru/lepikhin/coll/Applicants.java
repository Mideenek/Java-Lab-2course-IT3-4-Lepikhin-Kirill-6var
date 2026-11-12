package ru.lepikhin.coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Applicants {
    private final Map<String, int[]> scores = new LinkedHashMap<>();

    public Applicants(String filePath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filePath));

        for (int i = 1; i < lines.size(); i++) {
            String line = lines.get(i).trim();

            if (line.isEmpty()) {
                continue;
            }

            String[] parts = line.split(" ");
            String fullName = parts[0] + " " + parts[1];
            int[] marks = {
                    Integer.parseInt(parts[2]),
                    Integer.parseInt(parts[3]),
                    Integer.parseInt(parts[4])
            };

            scores.put(fullName, marks);
        }
    }

    public List<String> admitted() {
        List<String> result = new ArrayList<>();

        for (Map.Entry<String, int[]> entry : scores.entrySet()) {
            int[] m = entry.getValue();

            if (m[0] >= 30 && m[1] >= 30 && m[2] >= 30 && m[0] + m[1] + m[2] >= 140) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("абитуриенты:");

        for (Map.Entry<String, int[]> entry : scores.entrySet()) {
            sb.append("\n  ").append(entry.getKey())
                    .append(" -> ").append(entry.getValue()[0])
                    .append(", ").append(entry.getValue()[1])
                    .append(", ").append(entry.getValue()[2]);
        }

        return sb.toString();
    }
}