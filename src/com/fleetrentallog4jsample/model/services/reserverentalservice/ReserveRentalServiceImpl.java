package com.fleetrentallog4jsample.model.services.reserverentalservice;

import com.fleetrentallog4jsample.model.domain.RentalComposite;
import org.apache.log4j.Logger;

/**
 * Reserves the car.
 *
 * @author Mike.Prasad
 *
 *
 */
public class ReserveRentalServiceImpl implements IReserveRentalService {

    /*
	 * Category set in config/log4j.properties as
	 * log4j.category.com.classexercise=DEBUG, A1
     */
    static Logger log = Logger.getLogger("com.fleetrentallog4jsample");

    /**
     * Delegates request to the DAO.
     *
     * @param rentalComposite contains reservation information
     */
    @Override
    public boolean reserveRentalCar(RentalComposite rentalComposite) {
        /*-
        NOTE: In this version of the sample code, this method is just hardcoded 
              to return a boolean. In reality, the logic would interact with the
              database.
         */
        log.info("Reserving rental car is in progress");
        if (rentalComposite != null) {
            return true;
        } else {
            return false;
        }
    } //end reserveRentalCar

} //end ReserveRentalServiceImpl
