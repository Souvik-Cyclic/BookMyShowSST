package com.sst.bookmyshowsst.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity // Creates a table in the database
public class Seat extends BaseModel{
    private String name;
    private int rowNum;
    private int colNum;

    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;
}
