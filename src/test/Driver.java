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
		Train t=new Train();
		
		//طباعة معلومات المقعد بعد حجزه
		
		System.out.println(" " + Seat.getColumn);
		boolean success = t.reserveSeat( 5, "Ahmad");
        System.out.println("Reserve Seat 5: " + success);
        
        System.out.println(" " + train[0][3]);
	
        //Train.deleteAllReservedSeat();
        System.out.println("Seat 5 deleted!");
		
		
		
		
		
		
	}

}
