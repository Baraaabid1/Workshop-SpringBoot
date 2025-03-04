package com.example.tpfoyer.Repository;

import com.example.tpfoyer.entities.Chambre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IChambreRepository extends CrudRepository<Chambre,Long> {
}
