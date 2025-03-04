package com.example.tpfoyer.Controllers;


import com.example.tpfoyer.Services.IReservationService;
import com.example.tpfoyer.entities.Reservation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {
    @Autowired
    IReservationService reservationService;

    @GetMapping("/dispaly-reservations")
    public List<Reservation> displayreservation(){
        return reservationService.retrieveAllReservation();
    }

    @PutMapping("/update-reservation")
    public Reservation updatereservation(Reservation r){
        return reservationService.updateReservation(r);
    }
    @GetMapping("/dispaly-reservationbyid/{id}")
    public Reservation displayreservationbyid(@PathVariable("id") String idReservation){
        return reservationService.retrieveReservation(idReservation);
    }
}