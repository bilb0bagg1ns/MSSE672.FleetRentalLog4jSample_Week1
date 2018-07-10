package com.fleetrentallog4jsample.model.business.manager;


import com.fleetrentallog4jsample.model.domain.Customer;
import com.fleetrentallog4jsample.model.domain.RentalComposite;
import static junit.framework.TestCase.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 * This unit test tests the FleetRentalManager class. Only does positive/happy
 * path testing. Realistic test would be more comprehensive including all
 * negative testing!
 *
 * @author mike.prasad
 *
 *
 */
public class FleetRentalManagerTest  {

    private FleetRentalManager fleetRentalManager;
    private RentalComposite rentalComposite;
    private Customer customer;

    /* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
     */
    @Before
    public void setUp() throws Exception {

        /*
        * Don't forget that FleetManager has a static block where it loads
        * the application.properties file, which means, we need to pass
        * location of the application.properties.
        * 
        * If running in Eclipse, right click on the unit test and navigate to
        * 
        * 1. Run As -> Run Configuration
        * 2. Select Arguments Tab
        * 3. In VM Arguments section, add the -D property 
        * 	  -Dprop_location=E:\FleetRental\config\application.properties
        * 
        * If running on command line, you'd pass in the above -D option with the java command.
        * 
         */
        fleetRentalManager = FleetRentalManager.getInstance();

        customer = new Customer("Simpson", "Homer", "homer@duff.com", "619.111.1234", "619.111.1234");
        
        rentalComposite = new RentalComposite();
        rentalComposite.setCustomer(customer);
    }

    /**
     * Test performAction method for ReserveRental
     */
    @Test
    public final void performActionOnRegisterCustomer() {
        boolean action = fleetRentalManager.performAction("ReserveRental", rentalComposite);
        assertTrue(action);
    }

} //end FleetRentalManagerTest
