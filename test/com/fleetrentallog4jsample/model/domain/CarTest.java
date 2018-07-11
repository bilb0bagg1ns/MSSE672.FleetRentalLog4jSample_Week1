package com.fleetrentallog4jsample.model.domain;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class CarTest {

  private Logger log;

  @Before
  public void setUp() {
    log = Logger.getLogger("com.fleetrentallog4jsample");
  }

  /**
   * Tests with a valid car passed in
   */
  @Test
  public void validate() {
    Car c1 = new Car(28.9f, "Lotus", "Elise", "100");
    // c1.validate should assert to True since all variables 
    // being passed to create a new Car are all valid.
    assertTrue("c1 validates", c1.validate());
    log.info("testValidate PASSED");
  }

  /**
   * Tests with an invalid car passed in
   */
  @Test
  public void notValidate() {
    Car c1 = new Car();
    // c1.validate should not pass here since we are not
    // sending in valid parameters - in the case of Car
    // class, its valid only if all class variables are passed
    assertFalse("c1 does not validate", c1.validate());
    log.info("testNotValidate PASSED");
  }

  /**
   * Tests if two cars are equal
   */
  @Test
  public void equalsCar() {
    log.info("starting testEqualsCar()");
    Car c1 = new Car(28.9f, "Lotus", "Elise", "100");
    Car c2 = new Car(28.9f, "Lotus", "Elise", "100");
    // this should assert to true since the contents of 
    // c1 and c2 class variables are identical.
    assertTrue("c1 equals c2", c1.equals(c2));
    log.info("testEqualsCar PASSED");
  }

  /**
   * Tests if two cars are not equal
   */
  @Test
  public void notEqualsCar() {
    log.info("starting testNotEqualsCar()");
    Car c1 = new Car(28.9f, "Lotus", "Elise", "100");
    Car c2 = new Car(28.9f, "Ferrari", "Diablo", "100");
    // this should assert to false since the contents of 
    // c1 and c2 class variables are NOT identical.
    assertFalse("c1 does NOT equal c2", c1.equals(c2));
    log.info("testNotEqualsCar PASSED");
  }

}
