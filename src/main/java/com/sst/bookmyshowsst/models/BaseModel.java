package com.sst.bookmyshowsst.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {
    @Id // Identity or Primary Key Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Auditing Attributes
    private Date createdAt;
    private Date lastModifiedAt;
}

/*
Mapped super class annotation:
1. no table for parent class
2. all attributes for parent class will be present as columns
in all the child class tables.
 */