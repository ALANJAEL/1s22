public class p2p4_1s22{
	public static void main(String[] args) {
		int a=0;
		do{
			System.out.println("El valor de A es de" + a);
			a++;
		}while(a<10);

		a=0;
		do{
			System.out.println("Este es el nuevo valor de a" + a);
			a++;
			if(a>11) break;
		}while(true);

		do{
			System.out.println("Se mostrara esta linea");
		}while(false);
	}
}