package ru.validator.repository.inmemory;

import ru.validator.model.Way;
import ru.validator.repository.WayRepository;

import java.util.List;

public class InMemoryWayRepository implements WayRepository {
    @Override
    public List<Way> getAll() {
        return null;
    }

    @Override
    public List<Way> getByRegion(int regionId) {
        return null;
    }
}
