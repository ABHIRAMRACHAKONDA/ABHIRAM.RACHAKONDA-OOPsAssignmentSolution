package com.oopsassignment;

public class DriverClass {

	public static void main(String[] args) {

		HrDepartment hrDepartment = new HrDepartment();
		TechDepartment techDepartment = new TechDepartment();
		AdminDepartment adminDepartment = new AdminDepartment();

		System.out.println(adminDepartment.departmentName() + "\n" + adminDepartment.getTodaysWork() + "\n"
				+ adminDepartment.getWorkDeadline() + "\n" + adminDepartment.isTodayAHoliday() + "\n" + "\n"
				+ hrDepartment.departmentName() + "\n" + hrDepartment.doActivity() + "\n" + hrDepartment.getTodaysWork()
				+ "\n" + hrDepartment.getWorkDeadline() + "\n" + hrDepartment.isTodayAHoliday() + "\n" + "\n"
				+ techDepartment.departmentName() + "\n" + techDepartment.getTodaysWork() + "\n"
				+ techDepartment.getWorkDeadline() + "\n" + techDepartment.getTechStackInformation() + "\n"
				+ techDepartment.isTodayAHoliday());

	}

}
