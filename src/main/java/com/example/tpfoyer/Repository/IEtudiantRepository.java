package com.example.tpfoyer.Repository;

import com.example.tpfoyer.entities.Etudiant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEtudiantRepository  extends CrudRepository<Etudiant,Long> {
}
