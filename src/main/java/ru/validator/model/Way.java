package ru.validator.model;

import java.util.ArrayList;
import java.util.List;

public class Way {
    Integer id;
    Long wayId;
    List<Node> nodes;

    public Way(Long wayId, List<Node> nodes) {
        this.wayId = wayId;
        this.nodes = nodes;
    }
}
