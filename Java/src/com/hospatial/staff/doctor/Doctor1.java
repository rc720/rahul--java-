package com.hospatial.staff.doctor;

import com.hospital.staff.doctor.salary.Salary;
public class Doctor1 extends Salary {
	public static void main(String[] args) {
		Doctor1 doctor1 = new Doctor1();
		System.out.println(doctor1.calculateSalary(12, 1));;
	}
}