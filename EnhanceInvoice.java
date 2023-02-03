package com.InvoiceService;

public class EnhanceInvoice {
	
	private static final int COST_PER_MINUTE = 1;
    private static final double MINIMUM_COSt_PER_KILOMETER = 10;
    private static final double MINIMUM_FARE = 5.0;

    public double calculateFare(double distance, int time) {
        double totalFare = distance * MINIMUM_COSt_PER_KILOMETER + time * COST_PER_MINUTE;
        return Math.max(totalFare, MINIMUM_FARE);
    }

    public double calculateTotalFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += this.calculateFare(ride.getDistance(), ride.getTime());
        }
        return totalFare;
    }

    public int getNumberOfRides(Ride[] rides) {
        return rides.length;
    }

    public double calculateAverageRideCost(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += calculateFare(ride.getDistance(), ride.getTime());
        }

        return totalFare / rides.length;
    }
}
