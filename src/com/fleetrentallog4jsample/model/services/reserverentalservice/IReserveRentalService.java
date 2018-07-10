package com.fleetrentallog4jsample.model.services.reserverentalservice;

import com.fleetrentallog4jsample.model.domain.RentalComposite;
import com.fleetrentallog4jsample.model.services.IService;

/**
 * @author mike.prasad
 *
 */
public interface IReserveRentalService extends IService {

    public final String NAME = "IReserveRentalService";

    /**
     * Reserves a rental car
     */
    public boolean reserveRentalCar(RentalComposite rentalComposite);

}
