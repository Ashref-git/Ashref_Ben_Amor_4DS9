package tn.esprit.correctiontp2.Controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.correctiontp2.Entities.Subscription;
import tn.esprit.correctiontp2.Services.Interfaces.ISubscriptionService;

import java.util.List;

@RestController
@RequestMapping("/api/subscription")
@AllArgsConstructor
public class SubscriptionController {
    ISubscriptionService subscriptionService;
    @PostMapping("/addSubscription")
    Subscription addSubscription(@RequestBody Subscription subscription) {
        return subscriptionService.addSubscription(subscription);
    }

    @PutMapping("/updateSubscription")
    Subscription updateSubscription(@RequestBody Subscription subscription) {
        return subscriptionService.updateSubscription(subscription);
    }

    @DeleteMapping ("/deleteSubscription/{id}")
    Subscription deleteSubscription(@PathVariable Long id) {
        subscriptionService.deleteSubscription(id);
        return null;
    }

    @GetMapping ("/getSubscription/{id}")
    Subscription getSubscription(@PathVariable Long id) {
        return subscriptionService.getSubscription(id);
    }

    @GetMapping ("/getSubscriptions")
    List<Subscription> getAllCourses() {
        return subscriptionService.getAllSubscriptions();
    }

}
