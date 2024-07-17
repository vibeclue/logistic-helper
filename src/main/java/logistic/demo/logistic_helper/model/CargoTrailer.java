package logistic.demo.logistic_helper.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cargo_trailer")
public class CargoTrailer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cargo_trailer_id")
    private long cargoTrailerId;

    @Column(name = "trailer_number", nullable = false, length = 20)
    private String trailerNumber;

    public CargoTrailer() {
    }

    public CargoTrailer(String trailerNumber) {
        this.trailerNumber = trailerNumber;
    }

    public long getCargoTrailerId() {
        return cargoTrailerId;
    }

    public void setCargoTrailerId(long cargoTrailerId) {
        this.cargoTrailerId = cargoTrailerId;
    }

    public String getTrailerNumber() {
        return trailerNumber;
    }

    public void setTrailerNumber(String trailerNumber) {
        this.trailerNumber = trailerNumber;
    }

}
