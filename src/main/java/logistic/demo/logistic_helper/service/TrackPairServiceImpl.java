package logistic.demo.logistic_helper.service;

import logistic.demo.logistic_helper.dao.TrackPairRepository;
import logistic.demo.logistic_helper.model.TrackPair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackPairServiceImpl implements TrackPairService{

    @Autowired
    private TrackPairRepository trackPairRepository;


    @Override
    public List<TrackPair> getAllTrackPairs() {
        return trackPairRepository.findAll();
    }
}
