package ru.validator.repository;

import ru.validator.model.Way;

import java.util.List;

public interface WayRepository {
    List<Way> getAll();
    List<Way> getByRegion(int regionId);

}
