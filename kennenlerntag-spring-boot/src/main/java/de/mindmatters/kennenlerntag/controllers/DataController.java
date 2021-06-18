package de.mindmatters.kennenlerntag.controllers;
import de.mindmatters.kennenlerntag.dto.VisitPointDto;
import de.mindmatters.kennenlerntag.dao.VisitPoint;
import de.mindmatters.kennenlerntag.models.VisitPointsService;
import de.mindmatters.kennenlerntag.models.VisitPointMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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

    @RequestMapping(value = "svc/api/v1/points/", method = {RequestMethod.POST}, consumes="application/json")
    public ResponseEntity<HttpStatus> postPoints(@RequestBody VisitPointDto points)
    {
        visitPointsService.savePoints(points.mapToDao());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
