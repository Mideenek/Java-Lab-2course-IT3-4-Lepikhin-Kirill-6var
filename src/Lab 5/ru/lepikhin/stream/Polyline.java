package ru.lepikhin.stream;

public class Polyline {
    private final Point[] points;

    public Polyline(Point[] points) {
        this.points = points.clone();
    }

    public Point[] getPoints() {
        return points.clone();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Линия[");

        for (int i = 0; i < points.length; i++) {
            sb.append(points[i]);

            if (i < points.length - 1) {
                sb.append(",");
            }
        }

        return sb.append("]").toString();
    }
}