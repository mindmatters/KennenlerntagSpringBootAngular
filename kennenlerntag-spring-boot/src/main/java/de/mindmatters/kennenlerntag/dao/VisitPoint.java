package de.mindmatters.kennenlerntag.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public  class VisitPoint extends Point
{
    private Long id;

    @Getter
    @Setter
    private Date dateOfCreation;

    @Getter
    @Setter
    private Date updatedAt;

    @Getter
    @Setter
    private String name;

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

}