package ru.validator.model;

public class Node {
    Integer id;
    long osmId;
    long lat;
    long lon;

    public Node(long osmId, long lat, long lon) {
        this.osmId = osmId;
        this.lat = lat;
        this.lon = lon;
    }
}
