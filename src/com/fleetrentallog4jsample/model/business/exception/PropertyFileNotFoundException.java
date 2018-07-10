package com.fleetrentallog4jsample.model.business.exception;

public class PropertyFileNotFoundException extends Exception {

    public PropertyFileNotFoundException(final String inMessage, final Throwable inNestedException) {
        super(inMessage, inNestedException);
    }

} // end class PropertyFileNotFoundException
