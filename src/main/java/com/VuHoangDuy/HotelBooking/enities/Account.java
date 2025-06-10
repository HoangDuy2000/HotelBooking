package com.VuHoangDuy.HotelBooking.enities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Set;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String password;
    private Timestamp create_at;
    @ManyToOne()
    @JoinColumn(name = "roles_id")
    private Role roles;
    @OneToMany(mappedBy = "users")
    @JsonIgnore
    private Set<Booking> bookingSet;
    @OneToMany(mappedBy = "users")
    @JsonIgnore
    private Set<Hotel> hotelSet;
}
