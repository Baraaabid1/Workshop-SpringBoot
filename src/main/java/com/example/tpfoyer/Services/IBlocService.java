package com.example.tpfoyer.Services;

import com.example.tpfoyer.entities.Bloc;

import java.util.List;


public interface IBlocService {
    List<Bloc> retrieveBlocs();
    Bloc updateBloc (Bloc bloc);
    Bloc addBloc (Bloc bloc);
    Bloc retrieveBloc (long idBloc);
    void removeBloc (long idBloc);
    Bloc affecterChambresABloc(List<Long> numChambre, long idBloc);

}