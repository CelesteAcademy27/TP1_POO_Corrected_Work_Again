package ar.centro8.java.curso.poo_tp1.cuentas;

import ar.centro8.java.curso.poo_tp1.clientes.Cliente;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor

public abstract class Cuenta {
   private final int numeroCuenta;
   private final Cliente cliente;
   protected double saldo;

   // METODO DE ESTA CLASE PADRE LLAMADA Cuenta
   public void depositar(double monto) {
      if (monto > 0) {
         this.saldo += monto;
         System.out.println("se depositan: $" + monto);
         System.out.println("Saldo actual: $" + saldo);
      } else {
         System.out.println("No se puede hacer el deposito de un monto menor o igual que cero");
         System.out.println("El saldo sigue siendo: $" + saldo);
      }

   }

   // METODO ABSTRACTO SIN CUERPO
   public abstract void extraer(double monto);
}
