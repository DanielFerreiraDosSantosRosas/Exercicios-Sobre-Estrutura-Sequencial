import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159*/
		
		Scanner sc = new Scanner(System.in);
		
		double raio, area, pi = 3.14159;
		
		System.out.println("Por Favor, Digite O Valor Do Raio: ");
		raio = sc.nextDouble();
		
		area = pi * Math.pow( raio, 2);
		
		System.out.printf("Se O Valor Do Raio é %.2f O Valor Da Area Do Círculo É %.4f %n ", raio, area );
		
		
		sc.close();

	}

}
