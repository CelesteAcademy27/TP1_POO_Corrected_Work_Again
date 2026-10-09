package ar.centro8.java.curso.poo_tp1.cuentas;

import ar.centro8.java.curso.poo_tp1.clientes.Cliente;
import lombok.Getter;
import lombok.ToString;

@ToString(callSuper = true)
@Getter

public class CajaAhorro extends Cuenta {

    private double tasaInteres;

    // CONSTRUCTOR DE ESTA CLASE LLAMADA CajaAhorro
    public CajaAhorro(int numeroCuenta, Cliente cliente, double tasaInteres) {
        super(numeroCuenta, cliente);
        this.tasaInteres = tasaInteres;
    }

    // METODO EXTRAER
    @Override
    public void extraer(double monto) {
        if (monto <= 0) {
            System.out.println("No se puede hacer la extracción: el monto debe ser mayor a cero");
            System.out.println("El saldo sigue siendo: $" + this.saldo);
        } else if (monto > this.saldo) {
            System.out.println("No se puede hacer la extracción: saldo insuficiente.");
            System.out.println("Saldo disponible: $" + this.saldo);
        } else {
            this.saldo -= monto;
            System.out.println("Se extrajeron:$" + monto);
            System.out.println("Saldo actual: $" + this.saldo);
        }
    }

    // METODO COBRAR INTERESES
    public void cobrarIntereses() {
        if (this.saldo > 0 && tasaInteres > 0) {
            double interes = this.saldo * tasaInteres / 100;
            this.saldo += interes;
            System.out.println("Interes acreditado:$" + interes);
            System.out.println("Saldo actual: $" + this.saldo);
        } else {
            System.out.println("No se puede acreditar: tanto el saldo y la tasa de interes deben ser mayores que cero");

        }

    }

}
