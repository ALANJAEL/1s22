public class p2p2_1s22{
	public static void main(String[] args) {
		int a; 
		for(a=0;a<10;a++){
			System.out.println("Esto se repite " +a); 

			a=0; 
			for(;a<10;a+=2){
				System.out.println("Estos son los nuevos valores " +a);
			}

			a=1;
			for(;;a++){
				if(a>10) break;
				System.out.println("Ahora sin 2 elementos " +a);

			}
			a=1;
			for(;;){
				System.out.println("Ahora sin parametros ");
				if(a>10) break;
				a++;
			}
			int b=2,c,cp; 
			for(a=2;a<101;a++){
				cp=0;
				for(c=2;c<=a;c++){
					if((a%c)==0) cp++;
				}
				if(cp == 1)
				System.out.print(" "+ a);
				if(b==10){
					b=1;
					System.out.println();
				}
				b++;
			}
		}
	}
}