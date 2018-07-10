package com.fleetrentallog4jsample.model.services.factory;

import com.fleetrentallog4jsample.model.domain.Customer;
import com.fleetrentallog4jsample.model.domain.RentalComposite;

import com.fleetrentallog4jsample.model.services.exception.ServiceLoadException;
import com.fleetrentallog4jsample.model.services.manager.PropertyManager;
import com.fleetrentallog4jsample.model.services.reserverentalservice.IReserveRentalService;
import com.fleetrentallog4jsample.model.services.reserverentalservice.ReserveRentalServiceImpl;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.fail;
import static junit.framework.TestCase.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author mike.prasad
 *
 */
public class ServiceFactoryTest {

    private RentalComposite rentalComposite;
    private Customer customer;
    private IReserveRentalService reserveRentalService;
    private ServiceFactory serviceFactory;

    @Before
    public void setUp() throws Exception {

        // Hmmm, we have load the properties via the PropertyManager
        String propertyFileLocation = System.getProperty("prop_location");

        // Now that we have the property file location, lets have the 
        // PropertyManager class load it up
        PropertyManager propertyManager = new PropertyManager();
        propertyManager.loadProperties(propertyFileLocation);

        serviceFactory = ServiceFactory.getInstance();

        customer = new Customer("Simpson", "Homer", "homer@duff.com", "619.111.1234", "619.111.1234");
        rentalComposite = new RentalComposite();
        rentalComposite.setCustomer(customer);

        // initialize registrationService
        try {
            reserveRentalService = (IReserveRentalService) serviceFactory.getService("IReserveRentalService");
        } catch (ServiceLoadException e) {
            e.printStackTrace();
            fail("Should not see ServiceLoadException");
        }
    }

    @Test
    public void getInstance() {
        assertNotNull(serviceFactory);
    }

    /**
     * Test Factory to return the ReserveRentalService and assert it by checking
     * it is an instance of it's implementation
     *
     * This should be true since LoginServiceImpl implements ILoginService
     */
    @Test
    public void reserveRentalService() {
        try {
            reserveRentalService = (IReserveRentalService) serviceFactory.getService(IReserveRentalService.NAME);
            assertTrue(reserveRentalService instanceof ReserveRentalServiceImpl);
        } catch (ServiceLoadException e) {
            e.printStackTrace();
            fail("ServiceLoadException");
        }
    }

}
