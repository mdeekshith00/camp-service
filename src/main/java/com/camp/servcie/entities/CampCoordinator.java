package com.camp.servcie.entities;

import java.io.Serializable;

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
@Table(name = "camp_coordinator")
public class CampCoordinator implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "camp_coordinator-Id")
	private Integer CampCoordinatorId;             // Coordinator ID
	 @Column(nullable = true)
	private Integer userId;         // Reference to user-service
	 @Column(nullable = true)
	private Integer campId;         // Associated camp
	 
	private String role;         // Example: MAIN_COORDINATOR
	 @Column(nullable = true)
	private String contactNumber; // Emergency contact for camp


}
