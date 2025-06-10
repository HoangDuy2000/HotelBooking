package com.VuHoangDuy.HotelBooking.repositories;

import com.VuHoangDuy.HotelBooking.enities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
