import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐");
		System.out.println("DIGITE SEU SALÁRIO SEM AS VERBAS INDENIZATÓRIAS");
		System.out.println("‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐");
		
		double salario = sc.nextDouble();
		
		double aliquota1 = 0.075;
		double aliquota2 = 0.15;
		double aliquota3 = 0.225;
		double aliquota4 = 0.275;
		
		double faixa1 = 1903.99;
		double faixa2 = 2826.66;
		double faixa3 = 3751.05;
		double faixa4 = 4664.68;
	
		double imposto1 = (salario - faixa1) * aliquota1;
		double imposto2 = (salario - faixa2) * aliquota2 + (faixa2 - faixa1) * aliquota1;
		double imposto3 = (salario - faixa3) * aliquota3 + (faixa3 - faixa2) * aliquota2 + (faixa2 - faixa1) * aliquota1;
		double imposto4 = (salario - faixa4) * aliquota4 + (faixa4 - faixa3) * aliquota3 + (faixa3 - faixa2) * aliquota2 + (faixa2 - faixa1) * aliquota1;
		
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
