package test;

public class Person {
	private Name name;
	private int age;
	private Adress adress;
	
	public Person() {
		
	}
	public Person(Name name,int age,Adress adress) {
		this.name =name;
		this.age=age;
		this.adress=adress;
	}
	public String getFullName() {
		return name.getFullName();
	}
	public String toString(){
		return "name " + name + "age " +age + "adress " + adress;
	}
}
