package net.javaguides;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(parOImpar(3));
        System.out.println(invertir("java"));
        List<Integer> listaEnteros = List.of(10, 2, 8, 11, 5);
        System.out.println(obtenerMayor(listaEnteros));
        List<String> listaNombres = List.of("Daniel", "Jose", "Daniel", "Johan", "Jose");
        System.out.println(eliminarDuplicados(listaNombres));
        Persona johan = new Persona("Johan", 31);
        System.out.println(johan.esMayorDeEdad());
    }

    public static String parOImpar(int numero) {
        if(numero % 2 == 0){
            return "Par";
        }else{
            return "Impar";
        }
    }

    public static String invertir(String texto) {
        String invertido = "";
        for (int i = texto.length()-1; i >= 0 ; i--) {
            invertido += texto.charAt(i);
        }
        return invertido;
    }

    public static int obtenerMayor(List<Integer> numeros) {
        int mayor = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            if(mayor < numeros.get(i)){
                mayor = numeros.get(i);
            }
        }
        return mayor;
    }

    public static List<String> eliminarDuplicados(List<String> nombres) {
        List<String> nuevalistaNombres = new ArrayList<>();
        nuevalistaNombres.add(nombres.get(0));
        boolean repetido = false;
        for (int i = 0; i < nombres.size(); i++) {
            repetido = false;
            for (int j = 0; j < nuevalistaNombres.size(); j++) {
                if(nombres.get(i).equals(nuevalistaNombres.get(j))){
                    repetido = true;
                }
            }
            if(!repetido){
                nuevalistaNombres.add(nombres.get(i));
            }
        }
        return nuevalistaNombres;
    }
}