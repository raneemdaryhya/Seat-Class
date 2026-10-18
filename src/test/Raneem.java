package test;

public class Raneem {
	int a;
	int b;
	Raneem(){
		b++;
	}
	public void showData() {
		System.out.println("value of a = "+a);
		System.out.println("value of b = "+b);
		
	}
	//public static void increment(){
	//a++;
	//}
}
		class Demo{
		public static void main(String[] args) {
		Raneem s1=new Raneem();
		s1.showData();
		Raneem s2  = new Raneem();
		s2.showData();
		//Student.b++;
		//s1.showData();
		}
		}
