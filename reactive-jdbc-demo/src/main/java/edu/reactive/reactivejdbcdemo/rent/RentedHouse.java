package edu.reactive.reactivejdbcdemo.rent;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@ToString
@NoArgsConstructor
@Entity
public class RentedHouse {

    @Id
    @GeneratedValue
    private String uuid;
    private String address;
    private int numberOfRooms;
    private int rent;

}

