package logistic.demo.logistic_helper.service;

import logistic.demo.logistic_helper.model.TrackPair;

import java.util.List;
import java.util.Optional;

public interface TrackPairService {
    public List<TrackPair> getAllTrackPairs();
    public void createNewTrackPairOrUpdate(TrackPair trackPair);
    public void deleteTrackPair(long id);
    public Optional<TrackPair> getTrackPairById(long id);
    public List<TrackPair> getTrackPairsByHeadNumberPrefix(String prefix);
    public List<TrackPair> getTrackPairsByTrailerNumberPrefix(String prefix);
}
