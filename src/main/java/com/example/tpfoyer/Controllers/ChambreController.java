package com.example.tpfoyer.Controllers;


import com.example.tpfoyer.Services.IChambreService;
import com.example.tpfoyer.entities.Chambre;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreController {

    @Autowired
    IChambreService chambreService;

    @PostMapping("/add-chambre")
    public Chambre addchambre(@RequestBody Chambre c){
        return chambreService.addChambre(c);
    }
    @PutMapping("/update-chambre")
    public Chambre updatechambre(@RequestBody Chambre c){
        return chambreService.updateChambre(c);
    }
    @GetMapping("/display-chambre")
    public List<Chambre> dispalychambres(){
        return chambreService.retrieveAllChambres();
    }
    @GetMapping("/display-chambrebyid/{id}")
    public Chambre displaychambrebyid(@PathVariable("id") long idChambre){
        return chambreService.retrieveChambre(idChambre);
    }
}