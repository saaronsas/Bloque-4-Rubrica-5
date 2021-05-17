package Ejercicio09.Imagenes;

import java.util.ArrayList;
import java.util.List;

public class pov2 {

    public static String pov2(int exp) {
        if (exp == 0) {
            return "0";
        }
        List<Integer> digitos = new ArrayList<>();
        digitos.add(1);
        int tamano = 1;
        int tp;
        int ac = 0;
        for (int i = 0; i < exp; i++) {
            for (int j = 0; j < tamano; j++) {
                tp = digitos.get(j);
                tp *= 2;
                tp += ac;
                ac = 0;
                if (tp > 9) {
                    tp -= 10;
                    ac = 1;
                }
                digitos.set(j, tp);
            }
            if (ac == 1) {
                digitos.add(ac);
                tamano++;
                ac = 0;
            }
        }

        String s = "";
        for (int i = digitos.size() - 1; i >= 0; i--) {
            s += digitos.get(i);
        }
        return s;
    }

}
