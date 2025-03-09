package com.example.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;
    @OneToMany(mappedBy = "foyer")
    private Set<Bloc> blocs;
    @OneToOne(mappedBy = "foyer")
    private Universite universite;

    public void setUniversite(Universite universite) {
        this.universite = universite;
    }

}