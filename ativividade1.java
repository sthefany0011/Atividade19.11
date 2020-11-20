package Atividades;
//Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, 
//escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas foram as 
//ocorrências da maior pontuação.

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
		System.out.println("O valor do vetor é: "+vetor[i]);
	
	}
	
	 media=soma/10;
	 System.out.println("A média dos vetores é :"+media);
		
	 System.out.println("A quantidade de ocorrências :"+cont);
	 
	}
}
