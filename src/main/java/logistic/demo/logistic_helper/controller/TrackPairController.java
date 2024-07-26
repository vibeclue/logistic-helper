package logistic.demo.logistic_helper.controller;

import logistic.demo.logistic_helper.model.TrackPair;
import logistic.demo.logistic_helper.service.TrackPairService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/track_pairs")
@AllArgsConstructor
public class TrackPairController {

    private final TrackPairService trackPairService;

    @GetMapping
    public List<TrackPair> getAllTrackPairs() {
        return trackPairService.getAllTrackPairs();
    }

    @PostMapping
    public HttpStatus createNewTrackPair(@RequestBody TrackPair trackPair){
        trackPairService.createNewTrackPairOrUpdate(trackPair);
        return HttpStatus.OK;
    }

    // json
    @PutMapping
    public HttpStatus updateTrackPair(@RequestBody TrackPair trackPair){
        trackPairService.createNewTrackPairOrUpdate(trackPair);
        return HttpStatus.OK;
    }

    // /track_pairs/1
    @DeleteMapping("/{id}")
    public HttpStatus deleteTrackPair(@PathVariable("id") long id) {
        Optional<TrackPair> trackPair = trackPairService.getTrackPairById(id);
        if (trackPair.isPresent())
            trackPairService.deleteTrackPair(id);

        return HttpStatus.OK;
    }

    ///track_pairs/head_number?prefix=ABC
//    @GetMapping("/head_number")
//    public List<TrackPair> getTrackPairsByHeadNumberPrefix(@RequestParam String prefix){
//        return trackPairService.getTrackPairsByHeadNumberPrefix(prefix);
//    }
//
//    @GetMapping("/trailer_number")
//    public List<TrackPair> getTrackPairsByTrailerNumberPrefix(@RequestParam String prefix){
//        return trackPairService.getTrackPairsByTrailerNumberPrefix(prefix);
//    }

}
