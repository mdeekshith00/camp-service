package com.camp.servcie.entities;

import java.util.UUID;

public class CampBloodCollection {

	    private UUID id;                // Unique ID
	    private UUID campId;            // Associated camp ID
	    private UUID bloodUnitId;       // Blood unit ID from donation-service
	    private BloodGroup bloodGroup;  // Enum for blood group of collected unit
	    private int quantityML;         // Amount collected in ml
	    private boolean verified;       // Verified by donation service
	    private boolean stockUpdated;   // Whether blood-stock-service updated

	    // Enum definition for blood group
	    public enum BloodGroup {
	        A_POSITIVE,
	        A_NEGATIVE,
	        B_POSITIVE,
	        B_NEGATIVE,
	        AB_POSITIVE,
	        AB_NEGATIVE,
	        O_POSITIVE,
	        O_NEGATIVE
	    }

	    // Getters and setters can be added here if needed
	


}
