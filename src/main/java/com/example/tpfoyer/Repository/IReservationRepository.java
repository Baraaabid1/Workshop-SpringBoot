package com.example.tpfoyer.Repository;

import com.example.tpfoyer.entities.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReservationRepository extends CrudRepository<Reservation,Long> {
}
