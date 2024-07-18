package logistic.demo.logistic_helper.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "cargo_trailer")
public class CargoTrailer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cargo_trailer_id")
    private long cargoTrailerId;

    @Column(name = "trailer_number", nullable = false, length = 20)
    private String trailerNumber;


    public CargoTrailer(String trailerNumber) {
        this.trailerNumber = trailerNumber;
    }

}
