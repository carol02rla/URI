import java.io.IOException;
import java.util.Scanner;

public class PreenchimentoVetorIV_1179 {
    private Scanner input;
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int par[] = new int[5];
        int impar[] = new int[5];
        int num;
        int p = 0, i = 0;

        for(int n = 0; n < 15; n++) {
            num = input.nextInt();

            if(num%2 == 0) {
                par[p] = num;
                p++;
    
                if(p == 5) {
                    for(int j = 0; j < 5; j++) {
                        System.out.print("par[" + j + "] = ");
                        System.out.println(par[j]);
                    }
                    p = 0;
                }
            } else {
                impar[i] = num;
                i++;
                
                if(i == 5) {
                    for(int j = 0; j < 5; j++) {
                        System.out.print("impar[" + j + "] = ");
                        System.out.println(impar[j]);
                    }
                    i = 0;
                }
            }
        }

        for(int j = 0; j < i; j++) {
            System.out.print("impar[" + j + "] = ");
            System.out.println(impar[j]);
        }
        for(int j = 0; j < p; j++) {
            System.out.print("par[" + j + "] = ");
            System.out.println(par[j]);
        }
    }
 
}