package com.fleetrentallog4jsample.model.domain;

import static junit.framework.TestCase.assertTrue;
import org.junit.Before;
import org.junit.Test;
/**
 * @author mike.prasad
 *
 */
public class CustomerTest{

    private Customer customer1, customer2;

    /**
     * @throws java.lang.Exception
     */
   @Before
    public void setUp() throws Exception {

        customer1 = new Customer("Simpson", "Homer", "homer@duff.com", "619.111.1234", "619.111.1234");
        customer2 = new Customer("Simpson", "Homer", "homer@duff.com", "619.111.1234", "619.111.1234");

    }

    /**
     * Test method for {@link com.fleetrental.model.domain.Customer#validate()}.
     */
    @Test
    public final void validateCustomer() {
        System.out.println("starting testValidateCustomer()");
        // c1.validate should assert to True since all variables 
        // being passed to create a new Car are all valid.
        assertTrue("customer validates", customer1.validate());
        System.out.println("testValidate PASSED");
    }

    /**
     * Test method for
     * {@link com.fleetrental.model.domain.Customer#equals(com.fleetrental.model.domain.Customer)}.
     */
    @Test    
    public final void equalsCustomer() {
        System.out.println("starting testEqualsCustomer()");
        // this should assert to true since the contents of 
        // c1 and c2 class variables are identical.
        assertTrue("customer1 equals customer2", customer1.equals(customer2));
        System.out.println("testEqualsCustomer PASSED");

    }

}