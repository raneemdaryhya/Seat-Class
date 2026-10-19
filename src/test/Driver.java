package test;

public class Driver {

	public static void main(String[] args) {
		
		Seat[][]train=new Seat[23][4];
		for(int r=0;r<train.length;r++) {
			for(int c=0;c<train[r].length;c++) {
				train[r][c]=new Seat();
			}
		}
		Seat s1=new Seat();
		Seat s2=new Seat(2);
		//طباعة معلومات المقعد بعد حجزه
		System.out.println(" " + train[0][3]);
		System.out.println(" " + Seat.getColumn);
		Train.deleteSeat(train, 5);
        System.out.println("Seat 5 deleted!");
		
		
		
		
		
		
	}

}
