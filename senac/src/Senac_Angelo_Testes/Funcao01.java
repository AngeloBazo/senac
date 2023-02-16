package Senac_Angelo_Testes;

public class Funcao01 {
	
	private static int xx = 90;
	
	public static void funcao01() {
		
		int i = 10;
		int j = 20;
		int x = i+j+xx;
		
		System.out.println(x);
		
	}

	public int getXx() {
		return xx;
	}

	public void setXx(int xx) {
		this.xx = xx;
	}
	
	

}
