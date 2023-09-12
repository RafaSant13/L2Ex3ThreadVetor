package controller;

public class ThreadVetor extends Thread{
	
	int[] vetor;
	int a;

	public ThreadVetor(int[] vetor, int a ) {
		this.vetor= vetor;
		this.a = a;
	}
	
	public void run() {
		vetor();
	}

	private void vetor() {
		double tempoInicial, tempoFinal, tempoTotal;
		if (a%2==0) {
			tempoInicial = System.nanoTime();
			for (int i = 0; i <vetor.length;i++) {
				
			}
			tempoFinal = System.nanoTime();
			tempoTotal = (tempoFinal - tempoInicial)/ Math.pow(10, 9);
			System.out.println("Tempo para percorrer vetor por for: "+tempoTotal+" S.");
		}
		else {
			tempoInicial = System.nanoTime();
			for (int i : vetor) {
				
			}
			tempoFinal = System.nanoTime();
			tempoTotal = (tempoFinal - tempoInicial)/ Math.pow(10, 9);
			System.out.println("Tempo para percorrer vetor por for each: "+tempoTotal+" S.");
		}
		
	}

}
