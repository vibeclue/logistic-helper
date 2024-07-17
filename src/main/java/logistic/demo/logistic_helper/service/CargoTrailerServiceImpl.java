package logistic.demo.logistic_helper.service;

import logistic.demo.logistic_helper.dao.CargoTrailerRepository;
import logistic.demo.logistic_helper.model.CargoTrailer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoTrailerServiceImpl implements CargoTrailerService{

    @Autowired
    private CargoTrailerRepository cargoTrailerRepository;

    @Override
    public List<CargoTrailer> getAllCargoTrailers(){
        return cargoTrailerRepository.findAll();
    }
}
