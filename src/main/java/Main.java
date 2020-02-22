import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            lista.add(i);
        }
        System.out.println(lista);

        funkcjarekurencyjna(lista);

        System.out.println(lista);
    }

    private static void funkcjarekurencyjna(List<Integer> lista) {
        if(lista.isEmpty()) {
            return;
        } else {
            Integer first = lista.remove(0);
            funkcjarekurencyjna(lista);
            lista.add(first);
        }
    }


}
