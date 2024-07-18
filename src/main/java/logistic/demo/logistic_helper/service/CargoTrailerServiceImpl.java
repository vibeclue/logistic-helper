package logistic.demo.logistic_helper.service;

import logistic.demo.logistic_helper.repository.CargoTrailerRepository;
import logistic.demo.logistic_helper.model.CargoTrailer;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CargoTrailerServiceImpl implements CargoTrailerService{

    private final CargoTrailerRepository cargoTrailerRepository;

    @Override
    public List<CargoTrailer> getAllCargoTrailers(){
        return cargoTrailerRepository.findAll();
    }
}
