package com.VuHoangDuy.HotelBooking.enities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "rooms")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer number;
    private String type;
    private Double price;
    private Integer capacity;
    private String status;
    @ManyToOne()
    @JoinColumn(name = "hotel_id")
    private Hotel hotels;
    @OneToMany(mappedBy = "rooms")
    @JsonIgnore
    private Set<Booking> bookingSet;
}
