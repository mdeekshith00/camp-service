package com.camp.servcie.entities;

import java.sql.Timestamp;
import java.util.UUID;

public class DonorCampRegistration {


	    private UUID id;                       // Unique registration ID
	    private UUID donorId;                  // Donor reference (user-service)
	    private UUID campId;                   // Associated camp
	    private DonationStatus donationStatus; // REGISTERED, VERIFIED, DONATED, CANCELLED
	    private boolean rewardIssued;          // Whether certificate/reward is issued
	    private RewardType rewardType;         // CERTIFICATE, COUPON, POINTS
	    private Timestamp checkInTime;         // Donor check-in at camp
	    private Timestamp donationTime;        // Time donation occurred
	    private boolean healthVerification;    // Pass/Fail health check before donation

	    // Enums for donationStatus and rewardType
	    public enum DonationStatus {
	        REGISTERED,
	        VERIFIED,
	        DONATED,
	        CANCELLED
	    }

	    public enum RewardType {
	        CERTIFICATE,
	        COUPON,
	        POINTS
	    }

	    // Getters and setters can be added here
	

}
