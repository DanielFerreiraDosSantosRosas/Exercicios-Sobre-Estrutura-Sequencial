import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		mensagem explicativa, conforme exemplos.*/
		
		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2;
		
		System.out.println("Digite o Primeiro Numero Inteiro :");
		valor1 = sc.nextInt();
		
		System.out.println("Digite o Segundo Numero Inteiro :");
		valor2 = sc.nextInt();
		
		System.out.println("valor da soma :" + (valor1 + valor2));
		
		
		sc.close();

	}

}
