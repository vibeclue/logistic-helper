package logistic.demo.logistic_helper.dao;

import logistic.demo.logistic_helper.model.CargoTrailer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoTrailerRepository extends JpaRepository<CargoTrailer, Long> {
}
