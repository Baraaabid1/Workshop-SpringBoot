package com.example.tpfoyer.Repository;

import com.example.tpfoyer.entities.Universite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUniversiteRepository extends CrudRepository<Universite,Long> {
}
