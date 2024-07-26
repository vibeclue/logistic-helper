package logistic.demo.logistic_helper.service;

import logistic.demo.logistic_helper.repository.TrackPairRepository;
import logistic.demo.logistic_helper.model.TrackPair;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class TrackPairServiceImpl implements TrackPairService{

    private final TrackPairRepository trackPairRepository;

    @Override
    public List<TrackPair> getAllTrackPairs() {
        return trackPairRepository.findAllByOrderByTrackPairIdDesc();
    }

    @Override
    public void createNewTrackPairOrUpdate(TrackPair trackPair) {
        if (trackPair.getDate() == null)
            trackPair.setDate(LocalDate.now());
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

//    @Override
//    public List<TrackPair> getTrackPairsByHeadNumberPrefix(String prefix) {
//        return trackPairRepository.findByHeadNumberStartingWith(prefix);
//    }
//
//    @Override
//    public List<TrackPair> getTrackPairsByTrailerNumberPrefix(String prefix) {
//        return trackPairRepository.findByTrailerNumberStartingWith(prefix);
//    }


}
