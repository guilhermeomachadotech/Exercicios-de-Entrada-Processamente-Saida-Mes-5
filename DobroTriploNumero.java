package prjDobroTriploNumero;
import java.util.Scanner;
public class DobroTriploNumero {
	public static void main (String[]args) {
		double numero, dobro, triplo;
		Scanner ler=new Scanner (System.in);
		System.out.println ("Digite um n�mero:");
		numero=ler.nextDouble();
		dobro=numero*2;
		triplo=numero*3;
		System.out.println ("O dobro e o triplo do n�mero "+numero+" �, respectivamente, "+dobro+" e "+triplo+".");
		ler.close();
	}

}
