//package com.camp.servcie.entities;
//
//import java.util.UUID;
//
//import com.common.enums.AttendanceStatus;
//import com.common.enums.Role;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.EnumType;
//import jakarta.persistence.Enumerated;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@Builder
//@Setter
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@Table(name = "donor_reward")
//public class DonorReward {
//        @Id
//    	@GeneratedValue(strategy = GenerationType.IDENTITY)
//        @Column(name ="donor_reward_id")
//	    private Integer DonorRewardId;                       // Unique assignment ID
//        @Column(nullable = true)
//	    private Integer volunteerId;              // Reference to volunteer (user-service)
//        @Column(nullable = true)
//	    private Integer campId;                   // Associated camp
//        @Enumerated(EnumType.STRING)  
//	    @Column(nullable = false)
//	    private Role role;                     // Enum: REGISTRATION, COLLECTION, LOGISTICS, COORDINATOR
//	    private int hoursWorked;               // Hours contributed at camp
//	    private boolean rewardIssued;          // Certificate or recognition issued
//	    @Enumerated(EnumType.STRING)  
//	    @Column(nullable = false)
//	    private AttendanceStatus attendanceStatus; // Enum: PRESENT, ABSENT, LATE
//
//
//	
//
//}
