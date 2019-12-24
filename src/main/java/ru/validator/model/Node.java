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

    public Integer getId() {
        return id;
    }

    public long getOsmId() {
        return osmId;
    }

    public double getLat() {
        return lat * 1.0E-7D;
    }

    public double getLon() {
        return lon * 1.0E-7D;
    }
}
