package com.fleetrentallog4jsample.model.services;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.fleetrentallog4jsample.model.services.factory.ServiceFactoryTest;
import com.fleetrentallog4jsample.model.services.reserverentalservice.ReserveRentalServiceImplTest;

/**
 * Note, cannot test this standalone as we need the FleetRentalManager to load
 * application properties first
 *
 * Hence, run the ApplicationTestSuite
 *
 * @author Mike
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ServiceFactoryTest.class, ReserveRentalServiceImplTest.class})
public class AllServicesTestSuite {

}
