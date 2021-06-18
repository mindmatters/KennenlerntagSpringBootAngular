package de.mindmatters.kennenlerntag.controllers;
import de.mindmatters.kennenlerntag.dao.VisitPoint;
import de.mindmatters.kennenlerntag.models.VisitPointsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {

    private final VisitPointsService visitPointsService;

    public DataController(VisitPointsService visitPointsService) {
        this.visitPointsService = visitPointsService;
    }

    @RequestMapping(value = "svc/api/v1/points/")
    public ResponseEntity<List<VisitPoint>> getPrivateData() {

        return new ResponseEntity<>(visitPointsService.loadAllPoints(), HttpStatus.OK);
    }

}
