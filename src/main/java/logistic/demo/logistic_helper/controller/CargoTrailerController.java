package logistic.demo.logistic_helper.controller;

import logistic.demo.logistic_helper.model.CargoTrailer;
import logistic.demo.logistic_helper.service.CargoTrailerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class CargoTrailerController {

    @Autowired
    private CargoTrailerService cargoTrailerService;

    @GetMapping("/cargo_trailers")
    public List<CargoTrailer> showAllTrailers() {
        return cargoTrailerService.getAllCargoTrailers();
    }
}

