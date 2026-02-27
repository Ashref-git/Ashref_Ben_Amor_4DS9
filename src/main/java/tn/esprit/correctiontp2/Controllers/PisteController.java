package tn.esprit.correctiontp2.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.correctiontp2.Entities.Piste;
import tn.esprit.correctiontp2.Services.Interfaces.IpisteServices;

import java.util.List;

@RestController
@RequestMapping("/api/piste")
@AllArgsConstructor
public class PisteController {

    IpisteServices pisteServices;

    @PostMapping("/addPiste")
    Piste addPiste(@RequestBody Piste piste) {
        return pisteServices.addPiste(piste);
    }

    @PutMapping("/updatePiste")
    Piste updatePiste(@RequestBody Piste piste) {
        return pisteServices.updatePiste(piste);
    }

    @DeleteMapping("/deletePiste/{id}")
    void deletePiste(@PathVariable Long id) {
        pisteServices.deletePiste(id);
    }

    @GetMapping("/getPiste/{id}")
    Piste getPiste(@PathVariable Long id) {
        return pisteServices.getPiste(id);
    }

    @GetMapping("/getPistes")
    List<Piste> getAllPistes() {
        return pisteServices.getAllPistes();
    }
}
