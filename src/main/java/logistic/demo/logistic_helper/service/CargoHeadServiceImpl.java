package logistic.demo.logistic_helper.service;

import logistic.demo.logistic_helper.dao.CargoHeadRepository;
import logistic.demo.logistic_helper.model.CargoHead;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoHeadServiceImpl implements CargoHeadService{

    @Autowired
    private CargoHeadRepository cargoHeadRepository;

    @Override
    public List<CargoHead> getAllCargoHeads(){
        return cargoHeadRepository.findAll();
    }

}
