package com.fleetrentallog4jsample.model.services.reserverentalservice;


import com.fleetrentallog4jsample.model.domain.Customer;
import com.fleetrentallog4jsample.model.domain.RentalComposite;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import org.junit.Before;

import org.junit.Test;

public class ReserveRentalServiceImplTest  {

    private RentalComposite rentalComposite;
    private Customer customer;
    private IReserveRentalService reserveRentalService;

    
    @Before
    public void setUp() throws Exception {
        reserveRentalService = new ReserveRentalServiceImpl();        
        customer = new Customer("Simpson", "Homer", "homer@duff.com", "619.111.1234", "619.111.1234");
        rentalComposite = new RentalComposite();
        rentalComposite.setCustomer(customer);
    }

    /**
     * Test for a successful reservation
     */
    @Test
    public final void reserveRental() {

        boolean isReserved = reserveRentalService.reserveRentalCar(rentalComposite);
        assertTrue(isReserved);
    }

    /**
     * Test for a unsuccessful registration, by passing in null Customer
     */
    @Test    
    public final void registerCustomerUnSuccessful() {

        rentalComposite = null;
        boolean isReserved = reserveRentalService.reserveRentalCar(rentalComposite);
        assertFalse(isReserved);
    }

}
