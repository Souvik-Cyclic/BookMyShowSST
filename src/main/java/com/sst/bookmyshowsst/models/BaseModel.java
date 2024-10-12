package com.sst.bookmyshowsst.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseModel {
    @Id // Identity or Primary Key Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Auditing Attributes
    @CreatedDate
    private Date createdAt;
    @LastModifiedDate
    private Date lastModifiedAt;
}

/*
Mapped super class annotation:
1. no table for parent class
2. all attributes for parent class will be present as columns
in all the child class tables.
 */