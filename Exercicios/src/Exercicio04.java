import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/
		
		int numfunc;
		double horasTrab, valorPH, salario;
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Qual O Numero Do Funcionario ?");
		numfunc = sc.nextInt();
		System.out.println("Quantas Horas De Trabalho ?");
		horasTrab = sc.nextDouble();
		System.out.println("Quanto Ganha Por Hora ?");
		valorPH = sc.nextDouble();
		
		salario = valorPH * horasTrab ;
		
		System.out.println("NUMBER = " + numfunc);
		Locale.setDefault(Locale.US);
		System.out.printf("SALARY = U$ %.2f %n", salario);
		
		
		sc.close();

	}

}
