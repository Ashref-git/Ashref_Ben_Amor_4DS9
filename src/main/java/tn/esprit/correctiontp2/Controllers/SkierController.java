package tn.esprit.correctiontp2.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.correctiontp2.Entities.Skier;
import tn.esprit.correctiontp2.Services.Interfaces.ISkierService;

import java.util.List;

@RestController
@RequestMapping("/api/skier")
@AllArgsConstructor
public class SkierController {
    ISkierService skierService;
    @PostMapping("/addSkier")
    Skier addSkier(@RequestBody Skier skier) {
        return skierService.addSkier(skier);
    }

    @PutMapping("/updateSkier")
    Skier updateSkier(@RequestBody Skier skier) {
        return skierService.updateSkier(skier);
    }

    @DeleteMapping ("/deleteSkier/{id}")
    Skier deleteSkier(@PathVariable Long id) {
        skierService.deleteSkier(id);
        return null;
    }

    @GetMapping ("/getSkier/{id}")
    Skier getSkier(@PathVariable Long id) {
        return skierService.getSkier(id);
    }

    @GetMapping ("/getSkier")
    List<Skier> getAllSkiers() {
        return skierService.getAllSkiers();
    }

}
