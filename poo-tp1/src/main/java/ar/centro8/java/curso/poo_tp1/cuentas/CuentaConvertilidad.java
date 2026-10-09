package ar.centro8.java.curso.poo_tp1.cuentas;

import ar.centro8.java.curso.poo_tp1.clientes.ClienteEmpresa;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)

public class CuentaConvertilidad extends CuentaCorriente {

    private double saldoDolares;

    // CONSTRUCTOR DE ESTA CLASE LLAMADA CuentaConvertibilidad
    public CuentaConvertilidad(int numeroCuenta, ClienteEmpresa cliente, double montoDescubierto) {
        super(numeroCuenta, cliente, montoDescubierto);

    }

    // METODO DE depositarDolares
    public void depositarDolares(double monto) {
        if (monto > 0) {
            this.saldoDolares += monto;
            System.out.println("Se depositaron: USD " + monto);
        } else {
            System.out.println("El deposito no se puede realizar : el monto tiene que ser mayor a cero");
        }
    }

    // METODO DE extraerDolares
    public void extraerDolares(double monto) {
        if (monto > 0 && monto <= this.saldoDolares) {
            this.saldoDolares -= monto;
            System.out.println("Se extrajeron: USD" + monto);
            System.out.println("Saldo en dolares: USD" + this.saldoDolares);
        } else {
            System.out.println(
                    "No se puede extraer: el monto debe ser mayor que cero" + "y no superar el saldo en dolares");
            System.out.println("No se permite descubierto en dolares");
        }

    }

    // CONVERSIÓN DE PESOS A DOLARES
    public void convertirPesosADolares(double monto, double tasaConversion) {
        if (monto > 0 && monto <= this.saldo && tasaConversion > 0) {
            this.saldo -= monto; // Se restan los pesos del saldo en pesos
            this.saldoDolares += monto / tasaConversion; // Se suman los dólares convertidos

            System.out.println("Pesos convertidos: $" + monto);
            System.out.println("Saldo en pesos:$" + this.saldo);
            System.out.println("Saldo en dólares: USD" + this.saldoDolares);
        } else {
            System.out.println("No se puede convertir: el monto y la tasa deben ser mayores que cero"
                    + " y debe haber saldo suficiente en pesos");
        }
    }

    // CONVERSIÓN DE DOLARES A PESOS 
    public void convertirDolaresAPesos(double monto, double tasaConversion) {
        if (monto > 0 && monto <= this.saldoDolares && tasaConversion > 0) {
            this.saldoDolares -= monto;
            this.saldo += monto * tasaConversion;
            System.out.println("Dolares convertidos:USD" + this.saldoDolares);
            System.out.println("Saldo en pesos: $" + this.saldo);
        } else {
            System.out.println("No se puede convertir: tanto la tasa y el monto deben ser"
                    + "mayores que cero y tiene que haber saldo suficiente en dolares");

        }

    }

}
