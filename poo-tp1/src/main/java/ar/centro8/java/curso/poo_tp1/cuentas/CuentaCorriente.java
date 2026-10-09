package ar.centro8.java.curso.poo_tp1.cuentas;

import ar.centro8.java.curso.poo_tp1.clientes.Cliente;
import lombok.Getter;
import lombok.ToString;

@ToString(callSuper = true)
@Getter

public class CuentaCorriente extends Cuenta {
    private double montoDescubierto;

   // CONSTRUCTOR DE ESTA CLASE LLAMADA CuentaCorriente
   public CuentaCorriente(int numeroCuenta, Cliente cliente, double montoDescubierto) {
      super(numeroCuenta, cliente);
      this.montoDescubierto = montoDescubierto;
   }

   // DEPOSITO DE CHEQUES: ACREDITA EL VALOR DE UN CHEQUE AL SALDO EXISTENTE DE LA
   // CUENTA CORRIENTE
   public void depositarCheque(Cheque cheque) {
      if (cheque != null && cheque.getMonto() > 0) {
         saldo += cheque.getMonto(); // EQUIVALE A SUMAR EL CHEQUE AL SALDO ACTUAL
         System.out.println("Se deposito el cheque:$" + cheque.getMonto());
      } else {
         System.out.println("No se puede hacer el deposito: el cheque es nulo o su monto no es valido");
      }
   }

   // EXTRAER EFECTIVO: RETIRAR O DEBITAR UNA SUMA DE DINERO DE LA CUENTA CORRIENTE
   @Override
   public void extraer(double monto) {
      if (monto > 0 && monto <= getSaldo() + montoDescubierto) {
         saldo -= monto; // EQUIVALE A RESTAR EL MONTO EXTRAIDO AL SALDO ACTUAL
         System.out.println("Se extrajeron: $" + monto);
         System.out.println("Saldo actual: $" + getSaldo());
      } else {
         System.out.println("La extracción no se puede hacer: el monto supera el saldo y el descubierto disponibles");
      }
   }

}
