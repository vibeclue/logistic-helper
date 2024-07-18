package logistic.demo.logistic_helper.service;

import logistic.demo.logistic_helper.repository.CargoHeadRepository;
import logistic.demo.logistic_helper.model.CargoHead;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CargoHeadServiceImpl implements CargoHeadService{

    private final CargoHeadRepository cargoHeadRepository;

    @Override
    public List<CargoHead> getAllCargoHeads(){
        return cargoHeadRepository.findAll();
    }

}
