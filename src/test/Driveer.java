package test;

public class Driveer {

	public static void main(String[] args) {
		//Name  n =new Name();
		//Name n1=new Name("raneem","daryahya ");
		//Adress a=new Adress();
		//Adress a1=new Adress("st","ramallah ");
		Student s = new Student();
		Student s1= new Student("raneem ","daryahya " , "st","ramallah ", 20 , "r11 " , 2.5);
		
		//Name n2=new Name("e","r");
		//Adress a2=new Adress("ra","beitreema ");
		Instructor i=new Instructor();
		Instructor i1=new Instructor(new Name( "rimawi","rannem"),35,new Adress("ra","beitreema "),1500.0,"cyber ");
		System.out.println(s1.toString());
		System.out.println(i1.toString());
	}

}
