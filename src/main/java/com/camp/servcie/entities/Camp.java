 package com.camp.servcie.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import com.common.enums.CampStatus;
import com.common.enums.CampType;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
	    private Integer campId;   
	
	    @Column(name ="camp_name" , nullable= true)
	    private String name;               // Camp name/title
	    
	    @Column(nullable = true)
	    private LocalDateTime startDateTime; // Start date & time
	    
	    @Column(nullable = true)
	    private LocalDateTime endDateTime; // End date & time
	    
	    @Column(nullable = true)
	    private Integer maxDonors;         // Maximum donors allowed
	    
	    @Column(nullable = true)
	    private Integer maxVolunteers;     // Maximum volunteers allowed
	    
	    @Column(nullable = true)
	    private CampStatus status;   
	    
	    @Column(nullable = true)
	    private CampType campType;         // Enum: RANDOM, PLANNED
	    
	    private String coordinatorId;        // Assigned CampCoordinator (user-service)
	    
	    private String notes;              // Optional instructions/notes
	    
	    @OneToOne(mappedBy = "camp")
	    private CampLocation campLocation;
	    
	    @OneToMany(mappedBy = "camp" ,  cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	    @JsonManagedReference
	    private List<CampBloodCollection>  campBloodCollection;
	    
	    @OneToOne(mappedBy = "camp" ,  cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	    private CampCoordinator campCoordinator;
	    
	    @OneToMany(mappedBy = "camp" ,  cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	    @JsonManagedReference
	    private List<VolunteerCampAssignment> volunteerCampAssignment;

}
