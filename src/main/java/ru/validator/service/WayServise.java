package ru.validator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.validator.model.Way;
import ru.validator.repository.inmemory.InMemoryWayRepository;

import java.util.List;

@Service
public class WayServise {

    @Autowired
    private InMemoryWayRepository inMemWayRepository;

    public List<Way> getAll(){
        return inMemWayRepository.getAll();
    }

    public Double getLat(){return inMemWayRepository.getLat();}

    public Double getLon(){return inMemWayRepository.getLon();}


}
