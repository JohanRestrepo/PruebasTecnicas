package net.javaguides;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo){
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double monto){
        saldo += monto;
    }

    public void retirar(double monto){
        if(monto < 0){
            System.out.println("No se permiten motnos negativos");
        }else if(monto > saldo){
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        else{
            saldo -= monto;
            System.out.println("Nuevo saldo: " + saldo);
        }
    }

    public void mostrarSaldo(){
        System.out.println("El saldo de " + titular + " es: " + saldo);
    }
}
