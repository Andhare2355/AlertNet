package com.alertnet.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "police_details")
public class PoliceDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String dob;
    private String gender;
    private String email;
    private String password;
    private String phone;
    private String address;
    private String department;
    private String rank;
    private String badgeNumber;
    private String stationAddress;
    private Integer yearsOfService;

    // Path for the uploaded government ID proof
    private String govIdProofPath;

    private String emergencyContactName;
    private String emergencyContactPhone;
    private String emergencyContactRelation;

    // Constructors
    public PoliceDetails() {}

    public PoliceDetails(String name, String dob, String gender, String email, String password, String phone,
                         String address, String department, String rank, String badgeNumber,
                         String stationAddress, Integer yearsOfService, String govIdProofPath,
                         String emergencyContactName, String emergencyContactPhone, String emergencyContactRelation) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.department = department;
        this.rank = rank;
        this.badgeNumber = badgeNumber;
        this.stationAddress = stationAddress;
        this.yearsOfService = yearsOfService;
        this.govIdProofPath = govIdProofPath;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
        this.emergencyContactRelation = emergencyContactRelation;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public String getStationAddress() {
        return stationAddress;
    }

    public void setStationAddress(String stationAddress) {
        this.stationAddress = stationAddress;
    }

    public Integer getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(Integer yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public String getGovIdProofPath() {
        return govIdProofPath;
    }

    public void setGovIdProofPath(String govIdProofPath) {
        this.govIdProofPath = govIdProofPath;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }

    public void setEmergencyContactPhone(String emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone;
    }

    public String getEmergencyContactRelation() {
        return emergencyContactRelation;
    }

    public void setEmergencyContactRelation(String emergencyContactRelation) {
        this.emergencyContactRelation = emergencyContactRelation;
    }
}
