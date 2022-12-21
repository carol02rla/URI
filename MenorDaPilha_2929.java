import java.io.IOException;
import java.util.Scanner;

public class MenorDaPilha_2929 {
    
    private int fila[];
	private int inicio;
	private int fim;
	private int nElementos;

    public MenorDaPilha_2929(int n) {
        inicio = 0;
		fim = -1;
		nElementos = 0;
		
		fila =  new int[n];
    }

    public int tamanho() {
		return nElementos;
	}

	public boolean insere(int tempo) {
		if (nElementos == fila.length)
			return false;
        
		fim = (fim + 1) % fila.length;
	    fila[fim] = tempo;
		nElementos++;
		return true;
	}

	public int remove() {
		if (nElementos == 0)
			return -1;
            
		int valor = fila[inicio];
		
		inicio = (inicio + 1) % fila.length;
		nElementos--;
		return valor;
	}

    public void limpar(MenorDaPilha_2929 fila) {
        for(int i = 0; i < fila.tamanho(); i++) {
            fila.remove();
            nElementos--;
        }
    }
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);

        while(s.hasNext()) {
            int tempoTotal = 420;
            int N, H, M, C;
            N = s.nextInt();

            if(N < 0 || N > 25) {
                break;
            }

            MenorDaPilha_2929 filaSUS = new MenorDaPilha_2929(N);

            for(int i = 0; i < N; i++) {

                H = s.nextInt();
                if(H < 7 || H > 19) {
                    return;
                }
                M = s.nextInt();
                if(M < 0 || M >= 60) {
                    return;
                }
                C = s.nextInt();
                if(C < 0 || C > 720) {
                    return;
                }

                int tempo = (H * 60) + M;

                filaSUS.insere(tempo);
                
                while(tempoTotal < tempo) {
                    tempoTotal += 30;
                }
                
                if(tempoTotal - tempo <= C) {
                    filaSUS.remove();
                }

                tempoTotal += 30;

            }

            System.out.println(filaSUS.tamanho());
            
            filaSUS.limpar(filaSUS);

        }
 
    }
 
}