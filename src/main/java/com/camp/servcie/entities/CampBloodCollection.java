package com.camp.servcie.entities;

import java.io.Serializable;

import com.common.enums.BloodGroupType;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
public class CampBloodCollection implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "camp_blood_collection_id")
	private Integer campBloodCollectionId;  
	
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
	
	@ManyToOne
	@JoinColumn(name ="campBloodCollection_id")
	@JsonBackReference
	private Camp camp;

}
