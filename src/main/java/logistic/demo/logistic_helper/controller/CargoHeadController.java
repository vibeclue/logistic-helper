package logistic.demo.logistic_helper.controller;

import logistic.demo.logistic_helper.model.CargoHead;
import logistic.demo.logistic_helper.service.CargoHeadService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cargo_heads")
@AllArgsConstructor
public class CargoHeadController {

    private final CargoHeadService cargoHeadService;

    @GetMapping
    public List<CargoHead> showAllHeads() {
        return cargoHeadService.getAllCargoHeads();
    }

    @PostMapping
    public HttpStatus createNewCargoHead(@RequestBody CargoHead cargoHead) {
        cargoHeadService.createNewCargoHeadOrUpdate(cargoHead);
        return HttpStatus.OK;
    }

    @PutMapping
    public HttpStatus updateCargoHead(@RequestBody CargoHead cargoHead) {
        cargoHeadService.createNewCargoHeadOrUpdate(cargoHead);
        return HttpStatus.OK;
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteCargoHead(@PathVariable("id") long id) {
        Optional<CargoHead> cargoHead = cargoHeadService.getCargoHeadById(id);
        if (cargoHead.isPresent())
            cargoHeadService.deleteCargoHead(id);

        return HttpStatus.OK;
    }
}
