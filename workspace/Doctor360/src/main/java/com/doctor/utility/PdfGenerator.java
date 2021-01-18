package com.doctor.utility;

import java.io.FileOutputStream;
import java.util.List;

import org.springframework.stereotype.Component;

import com.doctor.entity.Patient;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Component
public class PdfGenerator {
	public void generatePDF(List<Patient> p){
		try {
			String file_name="E:\\Java by Sachin Sir\\html\\Doctor\\mayu.pdf";
			Document d=new Document();
			PdfWriter.getInstance(d, new FileOutputStream(file_name));
			d.open();
			
			Paragraph para=new Paragraph("Patient Report");
			d.add(para);
			
			PdfPTable table=new PdfPTable(8);
			PdfPCell c1=new PdfPCell(new Phrase("Name"));
			table.addCell(c1);
			c1=new PdfPCell(new Phrase("Age"));
			table.addCell(c1);
			c1=new PdfPCell(new Phrase("DOB"));
			table.addCell(c1);
			c1=new PdfPCell(new Phrase("Blood Group"));
			table.addCell(c1);
			c1=new PdfPCell(new Phrase("Mobile No"));
			table.addCell(c1);
			c1=new PdfPCell(new Phrase("Email"));
			table.addCell(c1);
			c1=new PdfPCell(new Phrase("Appointment Date"));
			table.addCell(c1);
			c1=new PdfPCell(new Phrase("Address"));
			table.addCell(c1);
			
			table.setHeaderRows(1);
			for(Patient patient:p){
			table.addCell(patient.getName());
			table.addCell(Integer.toString(patient.getAge()));
			table.addCell(patient.getDob());
			table.addCell(patient.getBloodGroup());
			table.addCell(Long.toString(patient.getMobile()));
			table.addCell(patient.getEmail());
			table.addCell(patient.getAppointDate());
			table.addCell(patient.getAddress());
			}
			d.add(table);
			d.close();
		} catch (Exception e) {
			
		}
	}

	
}
