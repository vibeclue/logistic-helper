package logistic.demo.logistic_helper.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDateTime;

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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private LocalDateTime date;

    @Column(name = "from_country", length = 30)
    private String fromCountry;

    @Column(name = "to_country", length = 30)
    private String toCountry;

    @Column(name = "cargo", length = 50)
    private String cargo;

    @Column(name = "comment", length = 100)
    private String comment;

    public TrackPair() {
    }

    public TrackPair(String headNumber, String trailerNumber) {
        this.headNumber = headNumber;
        this.trailerNumber = trailerNumber;
    }

    public long getTrackPairId() {
        return trackPairId;
    }

    public void setTrackPairId(long trackPairId) {
        this.trackPairId = trackPairId;
    }

    public String getHeadNumber() {
        return headNumber;
    }

    public void setHeadNumber(String headNumber) {
        this.headNumber = headNumber;
    }

    public String getTrailerNumber() {
        return trailerNumber;
    }

    public void setTrailerNumber(String trailerNumber) {
        this.trailerNumber = trailerNumber;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getFromCountry() {
        return fromCountry;
    }

    public void setFromCountry(String fromCountry) {
        this.fromCountry = fromCountry;
    }

    public String getToCountry() {
        return toCountry;
    }

    public void setToCountry(String toCountry) {
        this.toCountry = toCountry;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
