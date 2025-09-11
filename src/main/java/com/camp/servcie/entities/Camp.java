package com.camp.servcie.entities;

import java.time.LocalDateTime;
import java.util.UUID;

public class Camp {
	
	    private UUID id;                   // Unique camp identifier
	    private String name;               // Camp name/title
	    private String location;           // Address of camp
	    private Double geoLatitude;        // Latitude for mapping
	    private Double geoLongitude;       // Longitude for mapping
	    private LocalDateTime startDateTime; // Start date & time
	    private LocalDateTime endDateTime; // End date & time
	    private Integer maxDonors;         // Maximum donors allowed
	    private Integer maxVolunteers;     // Maximum volunteers allowed
	    private Status status;             // Enum: DRAFT, SCHEDULED, LIVE, COMPLETED, CANCELLED
	    private CampType campType;         // Enum: RANDOM, PLANNED
	    private UUID coordinatorId;        // Assigned CampCoordinator (user-service)
	    private String notes;              // Optional instructions/notes

	    // Enums for status and campType
	    public enum Status {
	        DRAFT, SCHEDULED, LIVE, COMPLETED, CANCELLED
	    }

	    public enum CampType {
	        RANDOM, PLANNED
	    }

	    // Getters and setters can be added here as needed
	


}
