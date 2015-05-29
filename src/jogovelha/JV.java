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
        
        do{
        // para ir mudando de jogador a cada jogada (metodo par/impar)
       	escolheJogador = escolheJogador%2
 		if(escolheJogador == 0){    
		// ler do teclado a posição no tabuleiro
       		System.out.println("Jogador '1', Entre com uma posição: ");
        	posicao=scanner.nextLine().charAt(0);
			// Colocar o simbolo na posição escolhida
       		 	for(int i=0; i<3 ; i++){       
                  		for(int j=0 ; j<3 ; j++){
                        		if(posicao==tabuleiro[i][j]){
                             		tabuleiro[i][j]='X';
					//passar a vez para o proximo jogador
                         		escolheJogador=escolheJogador+1;       
                    			}
              			}
       		 	}
       			// verifica se o jogador ainda é o mesmo jogador/caso a posição seja invalida
        		if(escolheJogador==0){    
              		System.out.println("\n\n\n\n\nPosição Inválida\n");        
        		}
           
        	}else{
		// ler do teclado a posição no tabuleiro
              	System.out.println("Jogador '2', Entre com uma posição");
              	posicao=scanner.nextLine().charAt(0);
              	    	for(int i=0; i<3 ; i++){       
                        	for(int j=0 ; j<3 ; j++){
				// Colocar o simbolo na posição escolhida
                             		if(posicao==tabuleiro[i][j]){
                               		tabuleiro[i][j]='O';
					//passar a vez para o proximo jogador
                               		escolheJogador=escolheJogador+1;
                         		}
                        	}
			}







}
}
