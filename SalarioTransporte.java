package prjSalarioTransporte;
import java.util.Scanner;
public class SalarioTransporte {
	public static void main (String[] args) {
		double salarioBruto, descVT;
		Scanner ler= new Scanner (System.in);
		System.out.println("Digite o sal�rio bruto da pessoa, que est� com desconto de 6% relacionado com o vale transporte:");
		salarioBruto=ler.nextDouble();
		descVT=(salarioBruto*6)/100;
		System.out.println("o desconto relacionado com o vale transporte � R$"+descVT+".");
		ler.close();
	}

}
