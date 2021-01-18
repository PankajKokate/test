package com.doctor.dao;

import java.util.List;

import com.doctor.entity.Patient;

public interface DoctorDao {
	boolean isInsertedSuccessfully(Patient e);

	List<Patient> getPatientRecord(long mobile);
}
