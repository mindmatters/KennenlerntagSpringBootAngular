package de.mindmatters.kennenlerntag.models;

import de.mindmatters.kennenlerntag.dao.VisitPoint;
import de.mindmatters.kennenlerntag.repositories.VisitPointsRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

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

    public void savePoints(List<VisitPoint> points)
    {
        visitPointsRepository.saveAll(points);
    }
}
