package com.VuHoangDuy.HotelBooking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelBookingController {

    @GetMapping("/")
    public String welcome(){
        return "Hello World";
    }
}
