package tn.esprit.correctiontp2.Services.Implementations;

import org.springframework.stereotype.Service;
import tn.esprit.correctiontp2.Entities.Subscription;
import tn.esprit.correctiontp2.Services.Interfaces.ISubscriptionService;
import tn.esprit.correctiontp2.Services.Repository.SubscriptionRepo;

import java.util.List;

@Service
public class SubscriptionServicelmpl implements ISubscriptionService {
    private final SubscriptionRepo subscriptionRepo;

    public SubscriptionServicelmpl(SubscriptionRepo subscriptionRepo) {
        this.subscriptionRepo = subscriptionRepo;
    }

    @Override
    public Subscription addSubscription(Subscription subscription) {
        return subscriptionRepo.save(subscription);
    }

    @Override
    public Subscription updateSubscription(Subscription subscription) {
        return subscriptionRepo.save(subscription);
    }

    @Override
    public void deleteSubscription(Long id) {
        subscriptionRepo.deleteById(id);
    }

    @Override
    public Subscription getSubscription(Long id) {
        return subscriptionRepo.findById(id).orElse(null);
    }

    @Override
    public List<Subscription> getAllSubscriptions() {
        return subscriptionRepo.findAll();
    }
}
