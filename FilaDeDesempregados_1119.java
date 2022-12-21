import java.io.IOException;
import java.util.Scanner;

public class FilaDeDesempregados_1119 {

    class No {
		private No ant;
		private int conteudo;
		private No prox;
		
		public No(){
			setAnt(null);
			setProx(null);
		}

		public int getConteudo() {
			return conteudo;
		}

		public void setConteudo(int conteudo) {
			this.conteudo = conteudo;
		}

		public No getProx() {
			return prox;
		}

		public void setProx(No prox) {
			this.prox = prox;
		}

		public No getAnt() {
			return ant;
		}

		public void setAnt(No ant) {
			this.ant = ant;
		}
	}

    private No inicio;
    private No fim;
    private int nElementos;

    public FilaDeDesempregados_1119 (int N, int k, int m) {
		inicio = null;
		fim = null;		
		nElementos = 0;
        createLDE(N);
        percorreFila(k, m, N);
    }

    private void createLDE(int N) {
        No aux = inicio;
        for(int i = 1; i <= N; i++) {
            No novoNo = new No();
            novoNo.setConteudo(i);
            if(i == 1) {
    			fim = novoNo;
                inicio = novoNo;
                aux = novoNo;
	            novoNo.setProx(inicio);
                novoNo.setAnt(fim);
            } else {
                inicio.setAnt(novoNo);
				if(i == N)
					novoNo.setProx(inicio);
				else
					novoNo.setProx(null);
	            aux.setProx(novoNo);
                novoNo.setAnt(fim);
                fim.setProx(novoNo);
                fim = novoNo;
                aux = novoNo;
            }
            nElementos++;
        }
    }

    private int remove(No p){
		if (p == null) {
			return -1;
		}
		
		int dado = p.getConteudo();
		p.getAnt().setProx(p.getProx());
		p.getProx().setAnt(p.getAnt());
			
		nElementos--;
		p = null;

		return dado;
	}

	private void percorreFila(int k, int m, int N) {
		int remaining = N;
		No j1 = inicio;
		No j2 = fim;

		do {
			for(int i = 1; i < k; i++) {
				j1 = j1.getProx();
			}
			for(int i = 1; i < m; i++) {
				j2 = j2.getAnt();
			}

			System.out.printf("%3d", remove(j1));
			remaining--;
			if(j1 != j2) {
				System.out.printf("%3d", remove(j2));
				remaining--;
			}

			if(j1.getAnt() == j2 || j1.getProx() == j2) {
				if(j1.getAnt() == j2) {
					j1.setAnt(j2.getAnt());
					j2.setProx(j1.getProx());
				}
				if(j1.getProx() == j2) {
					j1.setProx(j2.getProx());
					j2.setAnt(j1.getAnt());
				}
			}

			j1.getAnt().setProx(j1.getProx());
			j1.getProx().setAnt(j1.getAnt());
			if(j1 != j2) {
				j2.getAnt().setProx(j2.getProx());
				j2.getProx().setAnt(j2.getAnt());
			}

			j1 = j1.getProx();
			j2 = j2.getAnt();

			if(remaining > 0)
				System.out.print(",");
			else {
				System.out.print("\n");
				break;
			}

		} while (remaining != 0);
	}

    public static void main(String[] args) {
        int N, k, m;
		Scanner s = new Scanner(System.in);

		do {
			
			N = s.nextInt();
			k = s.nextInt();
			m = s.nextInt();

			if(N <= 0 || N >= 20 || k <= 0 || m <= 0)
				break;
			else {
				FilaDeDesempregados_1119 lista = new FilaDeDesempregados_1119(N, k, m);
			}

		} while (N > 0 && N < 20 && k > 0 && m > 0);
    }
}