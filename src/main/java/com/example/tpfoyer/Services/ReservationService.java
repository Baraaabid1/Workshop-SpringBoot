package com.example.tpfoyer.Services;

import com.example.tpfoyer.Repository.IReservationRepository;
import com.example.tpfoyer.entities.Reservation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService {
    @Autowired
    IReservationRepository reservationRepository;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return (List<Reservation>) reservationRepository.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return reservationRepository.save(res);
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return reservationRepository.findById(Long.valueOf(idReservation)).orElse(null);
    }
}
