package Snake_and_Ladder;

public class Roll_die {
	
	public static void main(String[] args) {
		
		int min_Value=1;
		int max_Value=6;
		int pos = 0;
		int die_roll = min_Value + (int)(Math.random() * ((max_Value-min_Value) + 1));

		
		System.out.println("Welcome to Snake and Ladder Game");
		
		System.out.println("Die Roll is : "+die_roll);
	}

}
