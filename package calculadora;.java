package calculadora;


import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		int n1 ;
		 
		int n2 ;
		//entrada
		Scanner input = new Scanner (System.in);
		
		System.out.println("qual o primeiro numero");
		
		n1 = input.nextInt();
	System.out.println("qual segundo numero");
		n2 = input.nextInt();
		
		System.out.println("soma: " +(n1+n2));
		System.out.println("subtração: "+(n1-n2));
		System.out.println("multiplicação: "+(n1*n2));
		System.out.println("divisão: "+(n1-n2));
		
		
		

	}

}
