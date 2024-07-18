package logistic.demo.logistic_helper.service;

import logistic.demo.logistic_helper.model.TrackPair;

import java.util.List;
import java.util.Optional;

public interface TrackPairService {
    List<TrackPair> getAllTrackPairs();
    void createNewTrackPairOrUpdate(TrackPair trackPair);
    void deleteTrackPair(long id);
    Optional<TrackPair> getTrackPairById(long id);
    List<TrackPair> getTrackPairsByHeadNumberPrefix(String prefix);
    List<TrackPair> getTrackPairsByTrailerNumberPrefix(String prefix);
}
