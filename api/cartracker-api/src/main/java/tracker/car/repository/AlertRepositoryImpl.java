package tracker.car.repository;

import org.springframework.stereotype.Repository;
import tracker.car.entity.Alert;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Arnab on 5/30/2017.
 */
@Repository
public class AlertRepositoryImpl implements AlertRepository {
    @PersistenceContext
    private EntityManager em;
    @Override
    public Alert create(Alert alert) {
        em.persist(alert);
        return alert;
    }
}
