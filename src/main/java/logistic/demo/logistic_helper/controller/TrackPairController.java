package logistic.demo.logistic_helper.controller;

import logistic.demo.logistic_helper.model.TrackPair;
import logistic.demo.logistic_helper.service.TrackPairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TrackPairController {

    @Autowired
    private TrackPairService trackPairService;

    @GetMapping("/track_pairs")
    public List<TrackPair> getAllTrackPairs() {
        return trackPairService.getAllTrackPairs();
    }
}
