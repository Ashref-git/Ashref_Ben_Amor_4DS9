package tn.esprit.correctiontp2.Services.Implementations;


import org.springframework.stereotype.Service;
import tn.esprit.correctiontp2.Entities.Piste;
import tn.esprit.correctiontp2.Services.Interfaces.IpisteServices;
import tn.esprit.correctiontp2.Services.Repository.PisteRepo;

import java.util.List;

@Service
public class PisteServicelmpl implements IpisteServices {
    private final PisteRepo pisteRepo;

    public PisteServicelmpl(PisteRepo pisteRepo) {
        this.pisteRepo = pisteRepo;
    }

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepo.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepo.save(piste);
    }

    @Override
    public void deletePiste(Long id) {
        pisteRepo.deleteById(id);
    }

    @Override
    public Piste getPiste(Long id) {
        return pisteRepo.findById(id).get();
    }

    @Override
    public List<Piste> getAllPistes() {
        return pisteRepo.findAll();
    }
}
