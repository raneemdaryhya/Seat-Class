package test;

public class Student extends  Person {
	private String id;
	private double gpa;
	
	public Student() {
		
	}
	public Student(String first,String last,String street,String city,int age,String id,double gpa) {
		super(new Name(first,last),age,new Adress(street , city));
		this.id=id;
		this.gpa=gpa;
	}
	public Student(Name name , int age,Adress adress,String id,double gpa) {
		super(name , age, adress);
		this.id=id;
		this.gpa=gpa;
	}
	public double getGpa() {
		return gpa;
	}
	public String getid() {
		return id;
	}
	public String toString() {
		return super.toString();
	}
}
