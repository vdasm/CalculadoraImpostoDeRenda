import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐");
		System.out.println("DIGITE SEU SALÁRIO SEM AS VERBAS INDENIZATÓRIAS");
		System.out.println("‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐");
		
		double salario;
		
		double aliquota1;
		double aliquota2;
		double aliquota3;
		double aliquota4;
		
		double faixa1;
		double faixa2;
		double faixa3;
		double faixa4;
	
		double imposto1;
		double imposto2;
		double imposto3;
		double imposto4;
		
		salario = sc.nextDouble();
		
		aliquota1 = 0.075;
		aliquota2 = 0.15;
		aliquota3 = 0.225;
		aliquota4 = 0.275;
	
		faixa1 = 1903.99;
		faixa2 = 2826.66;
		faixa3 = 3751.05;
		faixa4 = 4664.68;
		
		imposto1 = (salario - faixa1) * aliquota1;
		imposto2 = (salario - faixa2) * aliquota2 + (faixa2 - faixa1) * aliquota1;
		imposto3 = (salario - faixa3) * aliquota3 + (faixa3 - faixa2) * aliquota2 + (faixa2 - faixa1) * aliquota1;
		imposto4 = (salario - faixa4) * aliquota4 + (faixa4 - faixa3) * aliquota3 + (faixa3 - faixa2) * aliquota2 + (faixa2 - faixa1) * aliquota1;
				

		
		if (salario >= 0 & salario <= faixa1){
			System.out.printf("ISENTO");
		}
		
		if (salario > faixa1 & salario <= faixa2){
			System.out.printf("O VALOR A SER PAGO É DE R$ %.2f%n", imposto1);
		}
		if (salario > faixa2 & salario <= faixa3){
			System.out.printf("O VALOR A SER PAGO É DE R$ %.2f%n", imposto2);
		}
		
		if (salario > faixa3 & salario <= faixa4){
			System.out.printf("O VALOR A SER PAGO É DE R$ %.2f%n", imposto3);
		}
		
		if (salario > faixa4) {
			System.out.printf("O VALOR A SER PAGO É DE R$ %.2f%n", imposto4);
		}
		
		sc.close();
	}
}
