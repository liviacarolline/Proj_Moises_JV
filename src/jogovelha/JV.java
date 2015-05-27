package jogovelha;

import java.util.Scanner;

public class JV {

	      public static void main(String[] args) {
	    	  
	    //Criação das variaveis
	    	  
	        	Scanner scanner= new Scanner(System.in);
	            	int ganhou = 0;
	            	int escolheJogador=0;
	            	char posicao;
	            	char tabuleiro[][]=new char [3][3];
	        	tabuleiro[0][0]='1';
	        	tabuleiro[0][1]='2';
	        	tabuleiro[0][2]='3';
	        	tabuleiro[1][0]='4';
	        	tabuleiro[1][1]='5';
	        	tabuleiro[1][2]='6';
	        	tabuleiro[2][0]='7';
	        	tabuleiro[2][1]='8';
	        	tabuleiro[2][2]='9';
	        	
	// Mostrar Matriz
            
            for(int i=0; i<3 ; i++){      
                 for(int j=0 ; j<3 ; j++){
                       
                        System.out.printf("   "+tabuleiro[i][j]);
                  }
                 
                  System.out.println("\n");
            }





}
	      
}
