package tn.esprit.correctiontp2.Services.Interfaces;


import tn.esprit.correctiontp2.Entities.Subscription;

import java.util.List;

public interface ISubscriptionService {
        Subscription addSubscription(Subscription subscription);
        Subscription updateSubscription(Subscription subscription);
        void deleteSubscription(Long id);
        Subscription getSubscription(Long id);
        List<Subscription> getAllSubscriptions();
}
