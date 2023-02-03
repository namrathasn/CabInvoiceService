package com.InvoiceService;

public class InvoiceGenerator {
	
	private static final int COST_PER_MINUTE = 1;
    private static final double MINIMUM_COSt_PER_KILOMETER = 10;

    public double calculateFare(double distance, int time) {
    	
        return distance * MINIMUM_COSt_PER_KILOMETER + time * COST_PER_MINUTE;
    }
}
