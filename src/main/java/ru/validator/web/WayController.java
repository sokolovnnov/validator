package ru.validator.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.validator.model.Way;
import ru.validator.service.WayServise;

import java.util.List;

@Controller
public class WayController {

    private final WayServise wayService;

    @Autowired
    private WayController(WayServise wayServise) {
        this.wayService = wayServise;
    }



    public List<Way> getAll(){
        return wayService.getAll();
    }

    public Double getLat(){return wayService.getLat();}

    public Double getLon(){return wayService.getLon();}

}
