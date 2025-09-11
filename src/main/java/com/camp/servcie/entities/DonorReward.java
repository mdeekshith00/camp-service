package com.camp.servcie.entities;

import java.util.UUID;

public class DonorReward {

	    private UUID id;                       // Unique assignment ID
	    private UUID volunteerId;              // Reference to volunteer (user-service)
	    private UUID campId;                   // Associated camp
	    private Role role;                     // Enum: REGISTRATION, COLLECTION, LOGISTICS, COORDINATOR
	    private int hoursWorked;               // Hours contributed at camp
	    private boolean rewardIssued;          // Certificate or recognition issued
	    private AttendanceStatus attendanceStatus; // Enum: PRESENT, ABSENT, LATE

	    // Enums for role and attendance status
	    public enum Role {
	        REGISTRATION, COLLECTION, LOGISTICS, COORDINATOR
	    }

	    public enum AttendanceStatus {
	        PRESENT, ABSENT, LATE
	    }

	    // Getters and setters can be added here
	

}
