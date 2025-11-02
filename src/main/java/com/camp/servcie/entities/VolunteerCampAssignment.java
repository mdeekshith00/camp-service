package com.camp.servcie.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import com.common.enums.AttendanceStatus;
import com.common.enums.CampStatus;
import com.common.enums.CampType;
import com.common.enums.Role;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "volunteer_camp_assignment")
public class VolunteerCampAssignment implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "volunteer_camp_assignment_id")
	private Integer volunteerCampAssignmentId; 
	
	@Column(nullable = false)
	private Integer volunteerId;              // Reference to volunteer (user-service)
	
	@Column(nullable = false)
	private Integer campId; 
	
	@Enumerated(EnumType.STRING)  
    @Column(nullable = false)                 // Associated camp
	private Role role;                     // REGISTRATION, COLLECTION, LOGISTICS, COORDINATOR
	
	private Integer hoursWorked;           // Hours contributed at camp
	
	private Boolean rewardIssued;          // Certificate or recognition issued
	
	@Enumerated(EnumType.STRING)  
    @Column(nullable = false)
	private AttendanceStatus attendanceStatus; // PRESENT, ABSENT, LATE
	
	@ManyToOne
	@JoinColumn(name = "camp_id")
	@JsonBackReference
	private Camp camp;


}
