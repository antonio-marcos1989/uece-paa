import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> conjA  = new ArrayList<>(Arrays.asList(new Integer[]{1,2,3,4}));
        List<Integer> conjB  = new ArrayList<>(Arrays.asList(new Integer[]{1,2,3,4,5,6,7}));

        List<Integer> conjAB = new ArrayList<>();
        List<Integer> conj   = new ArrayList<>();

        int tamConjA = conjA.size();
        int tamConjB = conjB.size();

        if (tamConjA == 0) {
            conj = conjB;
            System.out.println("Conjunto A#B: \n"+conj.toString());
        } else if (tamConjB == 0) {
            conj = conjA;
            System.out.println("Conjunto A#B: \n"+conj.toString());
        } else {
            System.out.println("Conjunto A: \n"+conjA.toString());
            System.out.println("Conjunto B: \n"+conjB.toString());

            // Criando conjunto de similares
            for (int i = 0; i < tamConjA; i++) {
                for (int j = 0; j < tamConjB; j++) {
                    if (conjA.get(i) == conjB.get(j)) {
                        conjAB.add(conjB.get(j));
                    }
                }
            }

            System.out.println("Conjunto de similares A e B: \n"+conjAB.toString());

            int tamConjAB = conjAB.size();

            // Removendo elementos similares em A
            for (int a = 0; a < tamConjAB; a++){
                conjA.remove(conjAB.get(a));
            }

            // Removendo elementos similares em B
            for (int b = 0; b < tamConjAB; b++){
                conjB.remove(conjAB.get(b));
            }

            // Criando conjunto dos diferentes elementos
            conj.addAll(conjA);
            conj.addAll(conjB);

            System.out.println("Conjunto A#B: \n"+conj.toString());
        }
    }
}