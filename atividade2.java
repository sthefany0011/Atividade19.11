package Atividades;
//Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] N1= new int [4][6];
int [][] N2= new int [4][6];
int[][] M1=new int [4][6];
int[][] M2=new int [4][6];
Scanner ler = new Scanner(System.in);
System.out.println("Matriz N1[4][6]/n");
System.out.println("Matriz N2[4][6]/n");
		for(int linha=0;linha<4;linha++) {
			for(int coluna=0;coluna<6;coluna++) {
			System.out.printf("Insira o elemento  N1[d][d]",linha+1,coluna+1 );
			N1[linha][coluna]  =ler.nextInt();
		}
		
	}
		for(int linha=0;linha<4;linha++) {
			for(int coluna=0;coluna<6;coluna++) {
			System.out.printf("Insira o elemento  N2[d][d]",linha+1,coluna+1 );
			N2[linha][coluna]  =ler.nextInt();
		}
		
	}
		
		
		for(int l=0;l<4;l++) {
			for(int c=0;c < 6 ;c++) {
				M1[l][c]=N1[l][c]+N2[l][c];
				M2[l][c]=N1[l][c]-N2[l][c];
			}
}
		System.out.println("Soma da Matriz N1 com N2 /n");
	
		for(int l=0;l<4;l++) {
			for(int c=0;c < 6 ;c++) {
				System.out.printf("[ %d",M1[l][c],"]");
				System.out.println("/n");
				
				
			}
	
	}
		System.out.println("diferença ");
		for(int l=0;l<4;l++) {
			for(int c=0;c < 6 ;c++) {
				System.out.printf("[ %d",M2[l][c],"]");
				
				
}}
		System.out.println("/n");
	}}