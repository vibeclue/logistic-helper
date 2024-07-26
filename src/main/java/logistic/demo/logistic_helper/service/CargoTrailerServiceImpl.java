package logistic.demo.logistic_helper.service;

import logistic.demo.logistic_helper.repository.CargoTrailerRepository;
import logistic.demo.logistic_helper.model.CargoTrailer;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CargoTrailerServiceImpl implements CargoTrailerService{

    private final CargoTrailerRepository cargoTrailerRepository;

    @Override
    public List<CargoTrailer> getAllCargoTrailers(){
        return cargoTrailerRepository.findAll();
    }

    @Override
    public void createNewCargoTrailerOrUpdate(CargoTrailer cargoTrailer) {
        cargoTrailerRepository.save(cargoTrailer);
    }

    @Override
    public void deleteCargoTrailer(long id) {
        cargoTrailerRepository.deleteById(id);
    }

    @Override
    public Optional<CargoTrailer> getCargoTrailerById(long id) {
        return cargoTrailerRepository.findById(id);
    }
}
