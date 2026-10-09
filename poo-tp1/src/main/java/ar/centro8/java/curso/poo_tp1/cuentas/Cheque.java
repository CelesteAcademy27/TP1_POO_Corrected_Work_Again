package ar.centro8.java.curso.poo_tp1.cuentas;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class Cheque {
    private double monto;
    private String BancoEmisor;
    private LocalDate fechaPago;

}
