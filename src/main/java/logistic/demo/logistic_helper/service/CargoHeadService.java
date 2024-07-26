package logistic.demo.logistic_helper.service;

import logistic.demo.logistic_helper.model.CargoHead;

import java.util.List;
import java.util.Optional;

public interface CargoHeadService {
    List<CargoHead> getAllCargoHeads();
    void createNewCargoHeadOrUpdate(CargoHead cargoHead);
    void deleteCargoHead(long id);
    Optional<CargoHead> getCargoHeadById(long id);
}
