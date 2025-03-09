package com.example.tpfoyer.Repository;

import com.example.tpfoyer.entities.Reservation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface IReservationRepository extends CrudRepository<Reservation,Long> {

    @Query("SELECT r FROM Reservation r WHERE r.anneeUniversitaire = :anneeUniversitaire AND r.estValide = true")
    List<Reservation> findReservationsByAnneeUniversitaire(Date anneeUniversitaire);
}
