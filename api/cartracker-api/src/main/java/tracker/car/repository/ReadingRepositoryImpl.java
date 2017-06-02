package tracker.car.repository;

import org.springframework.stereotype.Repository;
import tracker.car.entity.Reading;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Arnab on 5/30/2017.
 */
@Repository
public class ReadingRepositoryImpl implements ReadingRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Reading create(Reading rd) {
        em.persist(rd);
        return rd;
    }
}
