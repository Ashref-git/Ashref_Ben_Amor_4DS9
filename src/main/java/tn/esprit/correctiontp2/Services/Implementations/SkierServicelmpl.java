package tn.esprit.correctiontp2.Services.Implementations;


import org.springframework.stereotype.Service;
import tn.esprit.correctiontp2.Entities.Skier;
import tn.esprit.correctiontp2.Services.Interfaces.ISkierService;
import tn.esprit.correctiontp2.Services.Repository.SkierRepo;

import java.util.List;

@Service
public class SkierServicelmpl implements ISkierService {
    private final SkierRepo skierRepo;

    public SkierServicelmpl(SkierRepo skierRepo) {
        this.skierRepo = skierRepo;
    }

    @Override
    public Skier addSkier(Skier skier) {
        return skierRepo.save(skier);
    }

    @Override
    public Skier updateSkier(Skier skier) {
        return skierRepo.save(skier);
    }

    @Override
    public void deleteSkier(Long id) {
        skierRepo.deleteById(id);
    }

    @Override
    public Skier getSkier(Long id) {
        return skierRepo.findById(id).get();
    }

    @Override
    public List<Skier> getAllSkiers() {
        return skierRepo.findAll();
    }
}
