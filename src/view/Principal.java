package view;

import controller.ThreadVetor;

public class Principal {

	public static void main(String[] args) {
		int tamanho = 1000;
		int [] vetor = new int [tamanho];
		for (int i = 0;i<tamanho;i++) {
			vetor[i] = (int)((Math.random() * 100) + 1);
		}
		
		Thread vetor1 = new ThreadVetor(vetor, 1);
		Thread vetor2 = new ThreadVetor(vetor, 2);
		
		vetor1.start();
		vetor2.start();
	}

}
