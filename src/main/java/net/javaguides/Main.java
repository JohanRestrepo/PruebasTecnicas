package net.javaguides;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(parOImpar(3));
    }

    public static String parOImpar(int numero) {
        if(numero % 2 == 0){
            return "Par";
        }else{
            return "Impar";
        }
    }
}