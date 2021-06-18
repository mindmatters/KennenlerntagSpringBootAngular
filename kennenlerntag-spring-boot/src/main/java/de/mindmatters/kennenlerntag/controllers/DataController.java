package de.mindmatters.kennenlerntag.controllers;
import de.mindmatters.kennenlerntag.dao.VisitPoint;
import de.mindmatters.kennenlerntag.models.VisitPointsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DataController {

    private final VisitPointsService visitPointsService;

    public DataController(VisitPointsService visitPointsService) {
        this.visitPointsService = visitPointsService;
    }

    @RequestMapping(value = "svc/api/v1/points/", method = RequestMethod.GET)
    public ResponseEntity<List<VisitPoint>> getPoints() {

        return new ResponseEntity<>(visitPointsService.loadAllPoints(), HttpStatus.OK);
    }

    @RequestMapping(value = "svc/api/v1/points/", method = RequestMethod.POST)
    public ResponseEntity<HttpStatus> postPoints(@RequestBody List<VisitPoint> points)
    {
        visitPointsService.savePoints(points);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
