package tracker.car.service;

import tracker.car.entity.Alert;
import tracker.car.entity.Reading;

/**
 * Created by Arnab on 5/30/2017.
 */
public interface AlertService {
    Alert create(Reading rd);
}
