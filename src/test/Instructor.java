package test;

public class Instructor extends Person {
	private double salary;
	private String dept;
	
	public Instructor () {
		
	}
	public Instructor ( String first,String last,String street,String city,int age,double salary, String dept) {
		super(new Name(first,last),age,new Adress(street , city));
		this.salary=salary;
		this.dept=dept;
	}
	
	public Instructor (Name name, int age,Adress adress, double salary,String dept) {
		super(name,age,adress);
		this.salary=salary;
		this.dept=dept;
	}
	public double getSalary() {
		return salary;
	}
	public String getDept() {
		return dept;
	}
	public String toString() {
		return super.toString();
	}
}
