package de.mindmatters.kennenlerntag.dto;

import lombok.Setter;
import lombok.Getter;
import de.mindmatters.kennenlerntag.dao.VisitPoint;

import java.util.List;

public class VisitPointDto {
    
    @Getter
    @Setter
    private String title;
    
    @Getter
    @Setter
    private List<List<String>> values;

    @Getter
    @Setter
    private List<String> fields;

    @Setter
    @Getter
    private List<Integer> types;

    @Getter
    @Setter
    private List<String> type_names;

    @Getter
    @Setter
    private String started_at;

    @Getter
    @Setter
    private String finished_at;

    @Getter
    @Setter
    private String checksum;

    public List<VisitPoint> mapToDao()
    {
        this.values.stream().
        final var daoPoint = new VisitPoint();
        daoPoint.setId(this.);

        return daoPoint;
    }
}
