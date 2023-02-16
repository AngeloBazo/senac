
public class Programa24_10_22 {

	public static void main(String[] args) {

		int x = 1;

		int y;

		if (x < 0)
			y = 10;
		else
			y = 20;

		System.out.println(y);
		
		x = -1;
		
		int opTernario = x < 0 ? (y = 10) : (y = 20);
		
		System.out.println(y);
		
		

	}

}
