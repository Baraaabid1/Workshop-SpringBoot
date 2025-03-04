package com.example.tpfoyer.Repository;

import com.example.tpfoyer.entities.Foyer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFoyerRepository extends CrudRepository<Foyer,Long> {
}
