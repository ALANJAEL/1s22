import java.util.Scanner;
import java.lang.Math;
public class p19_1s22{
	public static void main(String[] args) {
		java.util.Scanner teclado = new Scanner(System.in);
		double a;
		double b= 1.33;
		double resultado;
		System.out.println("calcular el volumen ");
		System.out.println("Escriba el radio: ");
		a = teclado.nextInt();
		resultado = b*Math.PI*Math.pow(a,3);
		//volumen es = (4/3)*PI*(r^3)
		System.out.println("El valor del volumen es: " + resultado);
	}
}