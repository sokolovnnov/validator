package ru.validator.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.validator.model.Way;
import ru.validator.service.WayServise;

import java.util.List;

@Controller
public class WayController {

    @Autowired
    private WayServise wayService;

    List<Way> getAll(){
        return wayService.getAll();
    }
}
