package com.example.tpfoyer.Repository;

import com.example.tpfoyer.entities.Bloc;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlocRepository extends CrudRepository<Bloc,Long> {
}
