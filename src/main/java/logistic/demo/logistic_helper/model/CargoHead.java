package logistic.demo.logistic_helper.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "cargo_head")
public class CargoHead {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cargo_head_id")
    private long cargoHeadId;

    @Column(name = "head_number", nullable = false, length = 20)
    private String headNumber;


    public CargoHead(String headNumber) {
        this.headNumber = headNumber;
    }

}
