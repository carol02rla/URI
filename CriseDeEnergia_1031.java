import java.io.IOException;
import java.util.Scanner;

public class CriseDeEnergia_1031 {
    class No {
		private int conteudo;
		private No prox;
		
		public No(){
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
	}

    private No cabeca;
    private No aux;
	private int nElementos;

    public CriseDeEnergia_1031 (int N){
		cabeca = null;
        aux = null;
		nElementos = 0;
        aux = createLSE(N);
        ordemRegioes(N);
	}

    public Object elemento (int pos) {
	    No aux = cabeca;
	    int cont = 1;

	    if (nElementos == 0) {
	        return null;
	    }

	    if ((pos < 1) || (pos > nElementos)){
	        return null;
	    }

	    while (cont < pos){
	        aux = aux.getProx();
	        cont++;
	    }

	    return aux.getConteudo();
	}
	public No remove(int pos, int m, No aux) {
	    if (nElementos == 0) {
	    	return null;
	    }

        No noRemovido = cabeca;
        if(pos == 1) {
            cabeca = noRemovido.getProx();
            aux.setProx(cabeca);
            noRemovido = null;
            aux = aux.getProx();
        } else {
            noRemovido = aux;
            for(int i = 1; i < m; i++) {
                aux = noRemovido;
                noRemovido = noRemovido.getProx();
            }
            aux.setProx(noRemovido.getProx());
            noRemovido = null;
            aux = aux.getProx();
        }
        nElementos--;
        return aux;
	}

    private No createLSE(int N) {
        aux = cabeca;
        for(int i = 1; i <= N; i++) {
            No novoNo = new No();
            if(i == 1) {
                cabeca = novoNo;
                novoNo.setConteudo(i);
                novoNo.setProx(aux);
                aux = novoNo;
            } else {
                if(i == N) {
                    novoNo.setProx(cabeca);
                } else {
                    novoNo.setProx(aux);
                }
                novoNo.setConteudo(i);
                aux.setProx(novoNo);
                aux = novoNo;
            }
            nElementos++;
        }
        return aux;
    }

    private void ordemRegioes(int N) {
        int m = 0;
        do {
            for(int i = 1; i <= N; i++) {
                aux = remove(i, m, aux);
            }
            if(aux.getConteudo() == 13) {
                break;
            }
            m++;
            createLSE(N);
        } while (aux.getConteudo() != 13);
        System.out.println(m);
    }

    public static void main(String[] args) throws IOException {
 
        int N;
        Scanner input = new Scanner(System.in);

        do {
            N = input.nextInt();
            if(N <= 0) {
                break;
            }
            CriseDeEnergia_1031 lista = new CriseDeEnergia_1031(N);
        } while (N != 0);
 
    }
 
}