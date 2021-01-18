package com.doctor.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.doctor.entity.Patient;
@Repository
public class DaoImplementation implements DoctorDao{
	@Autowired
	JdbcTemplate template;
	
	public boolean isInsertedSuccessfully(Patient p) {
		System.out.println(p.getName()+" "+p.getAge()+" "+p.getDob()+" "+p.getBloodGroup()+" "+p.getMobile()+" "+p.getEmail()+" "+p.getAppointDate()+" "+p.getAddress());
		try {
			Object []obj={p.getName(),p.getAge(),p.getDob(),p.getBloodGroup(),p.getMobile(),p.getEmail(),p.getAppointDate(),p.getAddress()};
			int i=template.update("insert into patient values(?,?,?,?,?,?,?,?)",obj);
			if(i==1){
				return true;
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return false;
	}

	public List<Patient> getPatientRecord(long mobile) {
		Object[] args = { mobile };
		List<Patient> al = template.query("select * from patient where mobile=?", args, new RowMapper<Patient>() {
			public Patient mapRow(ResultSet rs, int arg1) throws SQLException {

				Patient p = new Patient(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getLong(5),rs.getString(6),rs.getString(7),rs.getString(8));
				return p;
			}
		});
		return al;
	}

}
