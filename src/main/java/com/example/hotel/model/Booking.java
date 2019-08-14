package com.example.hotel.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@RequiredArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bookingNumber;
    private int numberOfAdults;
    private int numbersOfChildren;
    private LocalDate from;
    private LocalDate to;
    private boolean bookingCancelled;
    private double inAdvance;
    private double fullCharges;
    @ManyToOne
    private MenuBooking menuBooking;

}
