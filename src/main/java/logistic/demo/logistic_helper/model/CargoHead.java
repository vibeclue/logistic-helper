package logistic.demo.logistic_helper.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cargo_head")
public class CargoHead {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cargo_head_id")
    private long cargoHeadId;

    @Column(name = "head_number", nullable = false, length = 20)
    private String headNumber;


    public CargoHead() {
    }

    public CargoHead(String headNumber) {
        this.headNumber = headNumber;
    }

    public long getCargoHeadId() {
        return cargoHeadId;
    }

    public void setCargoHeadId(long cargoHeadId) {
        this.cargoHeadId = cargoHeadId;
    }

    public String getHeadNumber() {
        return headNumber;
    }

    public void setHeadNumber(String headNumber) {
        this.headNumber = headNumber;
    }

}
