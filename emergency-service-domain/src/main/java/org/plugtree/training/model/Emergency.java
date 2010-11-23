/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.plugtree.training.model;

import java.util.Date;

/**
 *
 * @author salaboy
 */
public class Emergency {
    public enum EmergencyType{FIRE, CAR_CRASH, HEART_ATTACK, ASSAULT};
    private Long id;
    private Call call;
    private Patient patient;
    private Ambulance ambulance;
    private Location location;
    private EmergencyType type;
    private Date approximateTime;
    private Hospital selectedHospital;
    private boolean processed;

    public Emergency() {
        
    }

    public Ambulance getAmbulance() {
        return ambulance;
    }

    public void setAmbulance(Ambulance ambulance) {
        this.ambulance = ambulance;
    }

    public Date getApproximateTime() {
        return approximateTime;
    }

    public void setApproximateTime(Date approximateTime) {
        this.approximateTime = approximateTime;
    }

    public Call getCall() {
        return call;
    }

    public void setCall(Call call) {
        this.call = call;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Hospital getSelectedHospital() {
        return selectedHospital;
    }

    public void setSelectedHospital(Hospital selectedHospital) {
        this.selectedHospital = selectedHospital;
    }

    public EmergencyType getType() {
        return type;
    }

    public void setType(EmergencyType type) {
        this.type = type;
    }

	public void setProcessed(boolean processed) {
		this.processed = processed;
	}

	public boolean isProcessed() {
		return processed;
	}
    
}