package de.mindmatters.kennenlerntag.models;

import de.mindmatters.kennenlerntag.dao.VisitPoint;
import de.mindmatters.kennenlerntag.repositories.VisitPointsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class VisitPointsService {

    private final VisitPointsRepository visitPointsRepository;

    public VisitPointsService(VisitPointsRepository visitPointsRepository) {
        this.visitPointsRepository = visitPointsRepository;
    }


    public List<VisitPoint> loadAllPoints()
    {
        return visitPointsRepository.findAll();
    }
}
