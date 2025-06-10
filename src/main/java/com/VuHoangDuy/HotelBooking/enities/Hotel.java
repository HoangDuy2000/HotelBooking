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
@Table(name = "hotels")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String address;
    private String city;
    private Float rating;
    @ManyToOne()
    @JoinColumn(name = "user_id")
    private Account users;
    @OneToMany(mappedBy = "hotels")
    @JsonIgnore
    private Set<Room> roomSet;
}
