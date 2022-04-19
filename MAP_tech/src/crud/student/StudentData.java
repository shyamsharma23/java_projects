package crud.student;

import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentData {
	private Set<Student> studentlist;
	private Scanner sc;
	
	public StudentData() {
		sc=new Scanner(System.in);
		studentlist=new HashSet<Student>();
	}
	
	public void insert() {
		System.out.println("Enter the number of records you want to add");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			Student obj = new Student();
			System.out.println("Enter the Student ID:");
			obj.setStudentid(sc.nextInt());
			System.out.println("Enter the Student name: ");
			obj.setStudentname(sc.next());
			System.out.println("Enter the Score: ");
			obj.setScore(sc.nextInt());
			studentlist.add(obj);
		}
	}
	
	public void update() {
		System.out.println("Enter the ID of the student you want to update");
		int id = sc.nextInt();
		System.out.println("Enter the updated name");
		String name = sc.next();
		System.out.println("Enter the updated score");
		int score = sc.nextInt();
		for(Student st: studentlist) {
			if(st.getStudentid()==id) {
				st.setScore(score);
				st.setStudentname(name);
			}
			
		}
	}
	
	public void remove() {
		System.out.println("Enter the Student id you want to delete:");
		int id = sc.nextInt();
		for(Student st: studentlist) {
			if(st.getStudentid()==id) {
				studentlist.remove(st);
			}
		}
	}
	
	public Set<Student> getdetails(){
		return studentlist;
	}
	
	public static void main(String[] args) {
		StudentData obj = new StudentData();
		obj.insert();
		Set<Student> list = obj.getdetails();
		for(Student sts: list) {
			System.out.println("Student Id: "+sts.getStudentid());
			System.out.println("Student name: "+sts.getStudentname());
			System.out.println("Student score: "+sts.getScore());
		}
		
	}

}
