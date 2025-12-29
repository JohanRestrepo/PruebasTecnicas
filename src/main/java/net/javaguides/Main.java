package net.javaguides;
import java.util.*;

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
        Producto producto1 = new Producto("Arroz", 1000);
        Producto producto2 = new Producto("mani", 600);
        Producto producto3 = new Producto("anteojos", 2000);
        Producto producto4 = new Producto("panela", 700);
        List<Producto> listaProductos = List.of(producto1,producto2,producto3,producto4);
        System.out.println(calcularTotal(listaProductos));
        System.out.println(contarVocales("esto es una prueba"));
        System.out.println(esPalindromo("anilina"));
        int [] numeros = {9,4,6,5,8,7};
        System.out.println(sumaPares(numeros));
        String [] palabras = {"Jose", "Tomas", "Anastacio"};
        System.out.println(ordenar(palabras));
        CuentaBancaria bancolombia = new CuentaBancaria("Johan" , 12000);
        bancolombia.mostrarSaldo();
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

    public static double calcularTotal(List<Producto> productos) {
        double total = 0;
        for (int i = 0; i < productos.size(); i++) {
            total += productos.get(i).getPrecio();
        }
        return total;
    }

    public static int contarVocales(String texto) {
        String aux;
        int conteo = 0;
        for (int i = 0; i < texto.length(); i++) {
            aux = String.valueOf(texto.charAt(i));
            if(aux.equals("a") || aux.equals("e") || aux.equals("i") || aux.equals("o") || aux.equals("u")){
                conteo ++;
            }
        }
        return conteo;
    }

    public static boolean esPalindromo(String texto) {
        String reversa = "";
        for (int i = texto.length()-1; i >= 0; i--) {
            reversa += texto.charAt(i);
        }
        if(texto.equals(reversa)){
            return true;
        }else{
            return false;
        }
    }

    public static int sumaPares(int[] numeros) {
        int aux = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 == 0){
                aux += numeros[i];
            }
        }
        return aux;
    }

    public static List<String> ordenar(String[] nombres) {
        List<String> nombresOrdenados = Arrays.asList(nombres);
        Collections.sort(nombresOrdenados);
        return nombresOrdenados;
    }
}