package ru.validator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.validator.model.Way;
import ru.validator.repository.WayRepository;

import java.util.List;

@Service
public class WayServise {

    @Autowired
    private WayRepository wayRepository;
    public List<Way> getAll(){
        return wayRepository.getAll();
    }
}
