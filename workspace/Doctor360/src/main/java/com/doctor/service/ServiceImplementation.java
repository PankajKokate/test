package com.doctor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.doctor.dao.DoctorDao;
import com.doctor.entity.Patient;
@Service
@ComponentScan(value="com.doctor.dao")
public class ServiceImplementation implements DoctorService{
	@Autowired
	public DoctorDao dao;
	
	public boolean isInsertedSuccessfully(Patient p) {
		return dao.isInsertedSuccessfully(p);
	}

	public List<Patient> getPatientRecord(long mobile) {
		
		return dao.getPatientRecord(mobile);
	}

}
