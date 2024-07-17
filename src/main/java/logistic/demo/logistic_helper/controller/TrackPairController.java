package logistic.demo.logistic_helper.controller;

import logistic.demo.logistic_helper.model.TrackPair;
import logistic.demo.logistic_helper.service.TrackPairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TrackPairController {

    @Autowired
    private TrackPairService trackPairService;

    @GetMapping("/track_pairs")
    public List<TrackPair> getAllTrackPairs() {
        return trackPairService.getAllTrackPairs();
    }

    @PostMapping("/track_pairs")
    public HttpStatus createNewTrackPair(@RequestBody TrackPair trackPair){
        trackPairService.createNewTrackPairOrUpdate(trackPair);
        return HttpStatus.OK;
    }

    @PutMapping("/track_pairs")
    public HttpStatus updateTrackPair(@RequestBody TrackPair trackPair){
        trackPairService.createNewTrackPairOrUpdate(trackPair);
        return HttpStatus.OK;
    }

    @DeleteMapping("/track_pairs/{id}")
    public HttpStatus deleteTrackPair(@PathVariable("id") long id) {
        Optional<TrackPair> trackPair = trackPairService.getTrackPairById(id);
        if (trackPair.isPresent())
            trackPairService.deleteTrackPair(id);
        return HttpStatus.OK;
    }

    @GetMapping("track_pairs/head_number")
    public List<TrackPair> getTrackPairsByHeadNumberPrefix(@RequestParam String prefix){
        return trackPairService.getTrackPairsByHeadNumberPrefix(prefix);
    }

    @GetMapping("track_pairs/trailer_number")
    public List<TrackPair> getTrackPairsByTrailerNumberPrefix(@RequestParam String prefix){
        return trackPairService.getTrackPairsByTrailerNumberPrefix(prefix);
    }

}
