 package com.camp.servcie.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

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
@Table(name = "camp")
public class Camp implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "camp_id")
	    private Integer campId;                   // Unique camp identifier
	    @Column(name ="camp_name" , nullable= true)
	    private String name;               // Camp name/title
	    @Column(nullable = true)
	    private String location;           // Address of camp
	    @Column(nullable = true)
	    private Double geoLatitude;        // Latitude for mapping
	    @Column(nullable = true)
	    private Double geoLongitude;       // Longitude for mapping
	    @Column(nullable = true)
	    private LocalDateTime startDateTime; // Start date & time
	    @Column(nullable = true)
	    private LocalDateTime endDateTime; // End date & time
	    @Column(nullable = true)
	    private Integer maxDonors;         // Maximum donors allowed
	    @Column(nullable = true)
	    private Integer maxVolunteers;     // Maximum volunteers allowed
	    @Column(nullable = true)
	    private Status status;             // Enum: DRAFT, SCHEDULED, LIVE, COMPLETED, CANCELLED
	    @Column(nullable = true)
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
