package com.camp.servcie.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

import com.common.enums.DonationStatus;
import com.common.enums.RewardType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "donor_camp_registration")
public class DonorCampRegistration implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "donor_camp_registration_id")
	    private Integer donorCampRegistrationId;                       // Unique registration ID
        @Column(nullable = true)
	    private Integer donorId;                  // Donor reference (user-service)
        @Column(nullable = true)
	    private Integer campId;                   // Associated camp
        @Column(nullable = true)
	    private DonationStatus donationStatus; // REGISTERED, VERIFIED, DONATED, CANCELLED
        @Column(nullable = true)
	    private boolean rewardIssued;          // Whether certificate/reward is issued
        @Column(nullable = true)
	    private RewardType rewardType;         // CERTIFICATE, COUPON, POINTS
        @Column(nullable = true)
	    private Timestamp checkInTime;         // Donor check-in at camp
	    private Timestamp donationTime;        // Time donation occurred
	    private boolean healthVerification;    // Pass/Fail health check before donation

}
