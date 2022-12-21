import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class ProblemaFacilRujiaLiu_1424 {
    
    private Scanner s;

    public static void main(String[] args) throws IOException {
        
        Scanner s = new Scanner(System.in);

        HashMap<Integer, ArrayList<Integer>> vetor = new HashMap<>();

        int n;
        int m;

        while(s.hasNext()) {
            n = s.nextInt();
            m = s.nextInt();

            for(int i = 0; i < n; i++) {
                int key = s.nextInt();

                if(vetor.containsKey(key)) {
                    vetor.get(key).add(i);
                } else {
                    ArrayList<Integer> array = new ArrayList<>();
                    array.add(i);
                    vetor.put(key, array);
                }
            }

            for(int i = 0; i < m; i++) {
                int k = s.nextInt();
                int v = s.nextInt();

                if(!vetor.containsKey(v) || k > vetor.get(v).size()) {
                    System.out.println(0);
                } else {
                    System.out.println(vetor.get(v).get(k-1) + 1);
                }
            }

            vetor.clear();
        }
        
        s.close();

    }
    
}