import java.io.IOException;
import java.util.Scanner;

public class BalancoParentesesI_1068 {
    
    private String pilha[];
	private int topo; 
    
    public BalancoParentesesI_1068(){
    	pilha = new String[1000];
    	topo = -1;
    }
    
    public int tamanho(){
		return topo+1;
	}

 	public boolean push(String s) {
        if (topo == (pilha.length-1)) 
            return false;
        
        topo++;
        pilha[topo] = s; 
        return true;
    }

    public String pop() {          
        if (topo == -1) 
            return "-1";
        
        String valor = pilha[topo]; 
        topo--; 
        return valor;
    }
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);

        while(s.hasNext()) {

            String str = s.nextLine();
            
            String[] string = str.split("");
    
            BalancoParentesesI_1068 abertos = new BalancoParentesesI_1068();
            BalancoParentesesI_1068 fechados = new BalancoParentesesI_1068();
    
            for(int i = 0; i < string.length; i++) {
                if(string[i].equals("(")) {
                    abertos.push(string[i]);
                } else if (string[i].equals(")")) {
                    fechados.push(string[i]);
                    if(abertos.tamanho() > 0) {
                        abertos.pop();
                        fechados.pop();
                    }
                }
            }

            if(abertos.tamanho() == 0 && fechados.tamanho() == 0) {
                System.out.println("correct");
            } else if (abertos.tamanho() != 0 || fechados.tamanho() != 0) {
                System.out.println("incorrect");
            }

        }

    }
 
}