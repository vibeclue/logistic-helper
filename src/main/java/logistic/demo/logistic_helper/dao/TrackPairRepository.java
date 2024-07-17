package logistic.demo.logistic_helper.dao;

import logistic.demo.logistic_helper.model.TrackPair;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackPairRepository extends JpaRepository<TrackPair, Long> {
}
