package Atividades;
//Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa que gere um vetor com os lan�amentos, 
//escreva esse vetor. A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m quantas foram as 
//ocorr�ncias da maior pontua��o.

import java.util.Scanner;

public class ativividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
	
	 int[] vetor= new int[10];
	 float media=0;
	 int soma=0, cont=0;
	 
	 
	 for (int i=0;i<10;i++) {
		 
		 System.out.println("Entre com o valor do vetor: ");
		 vetor[i]= ler.nextInt();
		 
		soma += vetor[i];
		if(vetor[i]==6) {
			cont++;
		}
	 }
	 
	for(int i=0;i<10;i++) {
		System.out.println("O valor do vetor �: "+vetor[i]);
	
	}
	
	 media=soma/10;
	 System.out.println("A m�dia dos vetores � :"+media);
		
	 System.out.println("A quantidade de ocorr�ncias :"+cont);
	 
	}
}
