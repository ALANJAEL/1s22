import java.util.Scanner;

public class p2p5_1s22{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		char opc='0';
		while (opc != 'S'){
			System.out.println("Menu de operaciones");
			System.out.println("");
			System.out.println("S.- Suma");
			System.out.println("R.- Resta");
			System.out.println("D.- Division");
			System.out.println("M.- Multiplicacion");
			System.out.println("X.- Salir");
			System.out.println("");
			System.out.println("Que opcion deseas");
			opc = teclado.nextLine().charAt(0);
			switch(opc){
			case 'S' : System.out.println("Aqui realizamos la suma");break;
			case 'R' : System.out.println("Aqui realizamos la resta");break;
			case 'M' : System.out.println("Aqui realizamos la multiplicacion");break;
			case 'D' : System.out.println("Aqui realizamos la division");break;
			case 'X' : break;
			}
		}
	}
}

