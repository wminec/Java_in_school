package ch06.example1;

public class Student extends Person {
	protected String name;
	protected int grade;
	
	public Student(){
		System.out.println("Student �θ� ������ ȣ��");
	}
	
	public String getName(){
		return name;
	}
	public int getGrade(){
		return grade;
	}
	
	public String getStudInfo(){
		System.out.println("Student Ŭ������ getStudInfo() �޼��� ȣ��");
		return "�̸�: "+name+", �г�: "+grade+", ����: "+gender+", ����: "+age;
	}
}