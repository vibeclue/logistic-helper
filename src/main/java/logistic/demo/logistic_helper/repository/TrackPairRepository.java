package logistic.demo.logistic_helper.repository;

import jakarta.persistence.Cacheable;
import logistic.demo.logistic_helper.model.TrackPair;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrackPairRepository extends JpaRepository<TrackPair, Long> {
    List<TrackPair> findByHeadNumberStartingWith(String prefix);
    List<TrackPair> findByTrailerNumberStartingWith(String prefix);
}
