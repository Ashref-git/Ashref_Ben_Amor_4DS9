package tn.esprit.correctiontp2.Services.Interfaces;


import tn.esprit.correctiontp2.Entities.Skier;

import java.util.List;

public interface ISkierService {
    Skier addSkier(Skier skier);
    Skier updateSkier(Skier skier);
    void deleteSkier(Long id);
    Skier getSkier(Long id);
    List<Skier> getAllSkiers();

}
