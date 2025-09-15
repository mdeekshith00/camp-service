package com.camp.servcie.entities;

import com.common.enums.BloodGroupType;

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
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "camp_blood_collection")
public class CampBloodCollection {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "camp_blood_collection_id")
	    private Integer campBloodCollectionId;                // Unique ID
	@Column(nullable = false)
	    private Integer campId;            // Associated camp ID
	@Column(nullable = false)
	    private Integer bloodUnitId;       // Blood unit ID from donation-service
	@Column(nullable = false)
	    private BloodGroupType bloodGroup;  // Enum for blood group of collected unit
	@Column(nullable = false)
	    private int quantityML;         // Amount collected in ml
	@Column(nullable = false)
	    private boolean verified;       // Verified by donation service
	@Column(nullable = false)
	    private boolean stockUpdated;   // Whether blood-stock-service updated


	    // Getters and setters can be added here if needed
	


}
