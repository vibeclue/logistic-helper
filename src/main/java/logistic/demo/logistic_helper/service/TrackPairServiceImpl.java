package logistic.demo.logistic_helper.service;

import logistic.demo.logistic_helper.dao.TrackPairRepository;
import logistic.demo.logistic_helper.model.TrackPair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TrackPairServiceImpl implements TrackPairService{

    @Autowired
    private TrackPairRepository trackPairRepository;


    @Override
    public List<TrackPair> getAllTrackPairs() {
        return trackPairRepository.findAll();
    }

    @Override
    public void createNewTrackPairOrUpdate(TrackPair trackPair) {
        if (trackPair.getDate() == null)
            trackPair.setDate(LocalDateTime.now());
        trackPairRepository.save(trackPair);
    }

    @Override
    public void deleteTrackPair(long id) {
        trackPairRepository.deleteById(id);
    }

    @Override
    public Optional<TrackPair> getTrackPairById(long id) {
        return trackPairRepository.findById(id);
    }

    @Override
    public List<TrackPair> getTrackPairsByHeadNumberPrefix(String prefix) {
        return trackPairRepository.findByHeadNumberStartingWith(prefix);
    }

    @Override
    public List<TrackPair> getTrackPairsByTrailerNumberPrefix(String prefix) {
        return trackPairRepository.findByTrailerNumberStartingWith(prefix);
    }
}
