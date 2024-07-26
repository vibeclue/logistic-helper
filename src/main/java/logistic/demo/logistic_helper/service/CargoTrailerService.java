package logistic.demo.logistic_helper.service;

import logistic.demo.logistic_helper.model.CargoHead;
import logistic.demo.logistic_helper.model.CargoTrailer;

import java.util.List;
import java.util.Optional;

public interface CargoTrailerService {
    List<CargoTrailer> getAllCargoTrailers();
    void createNewCargoTrailerOrUpdate(CargoTrailer cargoTrailer);
    void deleteCargoTrailer(long id);
    Optional<CargoTrailer> getCargoTrailerById(long id);
}
