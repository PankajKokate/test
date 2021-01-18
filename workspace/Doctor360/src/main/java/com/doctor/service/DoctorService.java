package com.doctor.service;

import java.util.List;

import com.doctor.entity.Patient;

public interface DoctorService {

	boolean isInsertedSuccessfully(Patient e);

	List<Patient> getPatientRecord(long mobile);

}
