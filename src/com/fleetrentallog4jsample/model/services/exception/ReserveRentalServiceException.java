package com.fleetrentallog4jsample.model.services.exception;

public class ReserveRentalServiceException extends Exception {

    public ReserveRentalServiceException(final String inMessage, final Throwable inNestedException) {
        super(inMessage, inNestedException);
    }
}
