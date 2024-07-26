package logistic.demo.logistic_helper.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "track_pair")
public class TrackPair {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "track_pair_id")
    private long trackPairId;

    @Column(name = "head_number", nullable = false)
    private String headNumber;

    @Column(name = "trailer_number", nullable = false)
    private String trailerNumber;

    @Column(name = "date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private LocalDate date;

    @Column(name = "from_country", length = 30)
    private String fromCountry;

    @Column(name = "to_country", length = 30)
    private String toCountry;

    @Column(name = "cargo", length = 50)
    private String cargo;

    @Column(name = "comment", length = 100)
    private String comment;

    @Column(name = "flag")
    private Boolean flag = false;


    public TrackPair(String headNumber, String trailerNumber) {
        this.headNumber = headNumber;
        this.trailerNumber = trailerNumber;
    }

}
