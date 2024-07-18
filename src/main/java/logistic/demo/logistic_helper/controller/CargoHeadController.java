package logistic.demo.logistic_helper.controller;

import logistic.demo.logistic_helper.model.CargoHead;
import logistic.demo.logistic_helper.service.CargoHeadService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cargo_heads")
@AllArgsConstructor
public class CargoHeadController {

    private final CargoHeadService cargoHeadService;

    @GetMapping
    public List<CargoHead> showAllHeads() {
        return cargoHeadService.getAllCargoHeads();
    }
}
