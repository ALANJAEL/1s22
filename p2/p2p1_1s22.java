import java.util.Scanner;

public class p2p1_1s22{
	public static void main(String[] args) {
		int opc = 1;
		switch(opc){
		case 1:
				System.out.println("Aqui estamos en la primera opcion");
				break;
		case 2:
				System.out.println("Aqui estamos en la segunda opcion");
				break;
		case 3:
				System.out.println("Aqui estamos en la tercera opcion");
				break;
		default:
				System.out.println("no existe el valor dentro de los casos");       
		}
		char opc1='a'; 
		switch(opc1){
		case 'a':
			System.out.println("Selecciono A");
			break; 
		case 'b':
			System.out.println("Selecciono B"); 
			break;
		case 'c':
			System.out.println("Selecciono C");
			break; 
		default:
				System.out.println("no esta dentro de las opciones");
		}
		char opc2;
		Scanner teclado = new Scanner(System.in);
		String operacion;
		int num1, num2;
		int resultado;

		opc2 = teclado.next().charAt(0);
		switch(opc2){
		case 's':
			System.out.println("aqui iran las operaciones de suma");
			System.out.println("aqui debemos realizar una suma:");
			System.out.println("numero 1:");
			num1 = teclado.nextInt();
			System.out.println("numero 2:");
			num2 = teclado.nextInt();
			resultado = num1 + num2;
			System.out.println("La suma es:" + resultado);
			break;

		case 'r':
			System.out.println("aqui iran las operaciones de resta");
			System.out.println("aqui debemos realizar una resta");
			System.out.println("numero 1:");
			num1 = teclado.nextInt();
			System.out.println("numero 2:");
			num2 = teclado.nextInt();
			resultado = num1 - num2;
			System.out.println("La resta es:" + resultado);
			break;
		case 'm':
			System.out.println("aqui iran las operaciones de multiplicacion");
			System.out.println("aqui debemos realizar una multiplicacion");
			System.out.println("numero 1:");
			num1 = teclado.nextInt();
			System.out.println("numero 2:");
			num2 = teclado.nextInt();
			resultado = num1 * num2;
			System.out.println("La multiplicacion es:" + resultado);
			break;
		case 'd':
			System.out.println("aqui iran las operaciones de division");
			System.out.println("aqui debemos realizar una division");
			System.out.println("numero 1:");
			num1 = teclado.nextInt();
			System.out.println("numero 2:");
			num2 = teclado.nextInt();
			resultado = num1 / num2;
			System.out.println("La division es:" + resultado);
			break;
		default:
			System.out.println("no existe la operacion a realizar....");

		}

	}
}