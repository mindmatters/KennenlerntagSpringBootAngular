package de.mindmatters.kennenlerntag.repositories;

import de.mindmatters.kennenlerntag.dao.VisitPoint;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VisitPointsRepository extends CrudRepository<VisitPoint, Long> {

    @Override
    List<VisitPoint> findAll();


}
