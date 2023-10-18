public class p2p3_1s22{
	public static void main(String[] args) {
		int a=0;

		while(a<11){
			System.out.println("el valor de a vale"+a);
			a++;
		}
		a=0;
		boolean estado = true;
		while(estado){
			System.out.println("nuevamente a vale"+a);
			if(a>9) break;
			a++;
		}

		estado = false;

		while(estado){
			System.out.println("se mostrara esta linea");
		}
	}
}