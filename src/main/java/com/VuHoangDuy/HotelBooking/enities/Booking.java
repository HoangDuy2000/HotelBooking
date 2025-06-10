package com.VuHoangDuy.HotelBooking.enities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date check_in;
    private Date check_out;
    private Integer guests;
    private String status;
    private Timestamp create_at;
    @ManyToOne()
    @JoinColumn(name = "users_id")
    private Account users;
    @ManyToOne()
    @JoinColumn(name = "room_id")
    private Room rooms;
}
