package org.college;

public class Student extends Department {

	public void studentName() {
		System.out.println("Farihah");
	}
	public void studentDept() {
		System.out.println("commerce");
	}
	public void studentId() {
		System.out.println("07");
	}
	public static void main(String[] args) {
		
     Student F = new Student();
     F.deptName();
     F.studentDept();
     F.studentId();
     F.studentName();
     F.collegeCode();
     F.collegeName();
     F.collegeRank();
		
	}

}
