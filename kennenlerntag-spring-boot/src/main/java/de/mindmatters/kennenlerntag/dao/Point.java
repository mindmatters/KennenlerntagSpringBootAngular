package de.mindmatters.kennenlerntag.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Point {

    @Getter
    @Setter
    private double latitude;

    @Getter
    @Setter
    private double longitude;

}
