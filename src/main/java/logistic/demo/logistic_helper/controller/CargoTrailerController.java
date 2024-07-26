package logistic.demo.logistic_helper.controller;

import logistic.demo.logistic_helper.model.CargoTrailer;
import logistic.demo.logistic_helper.service.CargoTrailerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/cargo_trailers")
@AllArgsConstructor
public class CargoTrailerController {

    private final CargoTrailerService cargoTrailerService;

    @GetMapping
    public List<CargoTrailer> showAllTrailers() {
        return cargoTrailerService.getAllCargoTrailers();
    }

    @PostMapping
    public HttpStatus createNewCargoTrailer(@RequestBody CargoTrailer cargoTrailer) {
        cargoTrailerService.createNewCargoTrailerOrUpdate(cargoTrailer);
        return HttpStatus.OK;
    }

    @PutMapping
    public HttpStatus updateCargoTrailer(@RequestBody CargoTrailer cargoTrailer) {
        cargoTrailerService.createNewCargoTrailerOrUpdate(cargoTrailer);
        return HttpStatus.OK;
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteCargoTrailer(@PathVariable("id") long id) {
        Optional<CargoTrailer> cargoTrailer = cargoTrailerService.getCargoTrailerById(id);
        if (cargoTrailer.isPresent())
            cargoTrailerService.deleteCargoTrailer(id);

        return HttpStatus.OK;
    }
}

