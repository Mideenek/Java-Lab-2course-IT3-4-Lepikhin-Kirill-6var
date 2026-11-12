package ru.lepikhin.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo {

    public static Polyline buildPolyline(List<Point> source) {
        List<Point> result = source.stream()
                .distinct()
                .sorted(Comparator.comparingInt(Point::getX))
                .map(p -> p.getY() < 0 ? new Point(p.getX(), -p.getY()) : p)
                .collect(Collectors.toList());

        return new Polyline(result.toArray(new Point[0]));
    }


    public static Map<Integer, List<String>> groupPeople(String filePath) throws IOException {
        return Files.lines(Paths.get(filePath))
                .map(String::trim)
                .filter(line -> line.contains(":"))
                .collect(Collectors.groupingBy(
                        line -> Integer.parseInt(line.substring(line.indexOf(':') + 1).trim()),
                        Collectors.mapping(
                                line -> normalize(line.substring(0, line.indexOf(':'))),
                                Collectors.toList())));
    }

    private static String normalize(String name) {
        String lower = name.trim().toLowerCase();

        if (lower.isEmpty()) {
            return lower;
        }

        return Character.toUpperCase(lower.charAt(0)) + lower.substring(1);
    }
}