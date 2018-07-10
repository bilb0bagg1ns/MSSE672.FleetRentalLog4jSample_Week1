package com.fleetrentallog4jsample.model.domain;

import java.io.Serializable;

/**
 * Domain Car class that holds the rental rate, the car manufacturer, model and
 * miles included.
 *
 * @author mike.prasad
 *
 */
public class Car implements Serializable {

    /**
     * Car ID
     */
    private Integer carId;

    /**
     * Daily rate
     */
    private float rate;

    /**
     * Car manufacturer
     */
    private String manufacturer;

    /**
     * Car model
     */
    private String model;

    /**
     * Free miles included in this rental
     */
    private String milesIncluded;

    /**
     * Y/N : Rented/Not Rented
     */
    private String rented;

    /**
     * Location where this car is available Part of Hibernate mapping, that Car
     * to Location is a one-to-many association.
     */
    private Location location;

    /**
     *
     */
    public Car() {

        // TODO Auto-generated constructor stub
    }

    /**
     * @param rate
     * @param manufacturer
     * @param model
     * @param milesIncluded
     */
    public Car(float rate, String manufacturer, String model, String milesIncluded) {
        super();
        this.rate = rate;
        this.manufacturer = manufacturer;
        this.model = model;
        this.milesIncluded = milesIncluded;
    }

    public Car(float rate, String manufacturer, String model, String milesIncluded, String rented) {
        super();
        // TODO Auto-generated constructor stub
        this.rate = rate;
        this.manufacturer = manufacturer;
        this.model = model;
        this.milesIncluded = milesIncluded;
        this.rented = rented;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    /**
     * @return Returns the rate.
     */
    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    /**
     * @return Returns the manufacturer.
     */
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * @return Returns the model.
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return Returns the milesIncluded.
     */
    public String getMilesIncluded() {
        return milesIncluded;
    }

    public void setMilesIncluded(String milesIncluded) {
        this.milesIncluded = milesIncluded;
    }

    public String getRented() {
        return rented;
    }

    public void setRented(String rented) {
        this.rented = rented;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * Validate if the instance variables are valid
     *
     * @return boolean - true if instance variables are valid, else false
     */
    public boolean validate() {
        if (rate == 0.0) {
            return false;
        }
        if (manufacturer == null) {
            return false;
        }
        if (model == null) {
            return false;
        }
        if (milesIncluded == null) {
            return false;
        }

        return true;
    }

    /**
     *
     * @param car
     * @return
     */
    public boolean equals(Car car) {
        if (rate != car.rate) {
            return false;
        }
        if (manufacturer != car.manufacturer) {
            return false;
        }
        if (!manufacturer.equals(car.manufacturer)) {
            return false;
        }
        if (!model.equals(car.model)) {
            return false;
        }
        if (!milesIncluded.equals(car.milesIncluded)) {
            return false;
        }

        return true;
    }

    /**
     * toString() method useful for logging
     *
     * You can auto generate this by using toString() method generator plugin
     * -http://eclipse-jutils.sourceforge.net/
     */
    public String toString() {
        StringBuffer strBfr = new StringBuffer();
        strBfr.append("Rate :");
        strBfr.append(rate);
        strBfr.append("\nManufacturer :");
        strBfr.append(manufacturer);
        strBfr.append("\nModel :");
        strBfr.append(model);
        strBfr.append("\nMiles Included :");
        strBfr.append(milesIncluded);

        return strBfr.toString();
    }

} //end Car
