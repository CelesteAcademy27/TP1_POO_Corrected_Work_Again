package ar.centro8.java.curso.poo_tp1.test; 



import ar.centro8.java.curso.poo_tp1.clientes.*; 
import ar.centro8.java.curso.poo_tp1.cuentas.*; 
import ar.centro8.java.curso.poo_tp1.cuentas.CuentaConvertilidad;
import java.time.LocalDate;




public class TestSistemaBancarios { 
    public static void main(String[] args) { 
   
    // CREACIÓN DE OBJETOS PARA INSTANCIAR UN CLIENTE INDIVIDUAL . 
    // ASIGNACIÓN DE CAJA DE AHORRO , DEPOSITO , EXTRACCIÓN  DE DINERO y COBRO DE INTERESES

    //1. Creación de un cliente individual 
    ClienteIndividual  cliente1  = new ClienteIndividual(1,"Valentina", "Castel", "12336790");  

    //2. Creación de una caja de ahorro asociandola con el cliente 
    CajaAhorro cuenta = new CajaAhorro(102, cliente1,2.5);

    //3. Realizar el deposito
    cuenta.depositar(5000.0);
    System.out.println("Deposito de 5000 realizado."); 

    //4.Realizar una extracción 
    cuenta.extraer(2000.0); 
    System.out.println("Extracción de 2000$ realizada");
     
    //5. Cobrar intereses 
    cuenta.cobrarIntereses(); 
    System.out.println("Intereses cobrados. saldo actual:" + cuenta.getSaldo()); 

   
    // CREACIÓN DE OBJETOS PARA Cliente2 CON LA INTERVENCIÓN DE CUENTA CORRIENTE Y CHEQUE

    ClienteIndividual cliente2 = new ClienteIndividual(2, "Adrian", "Amenabar", "22667709");  

    CuentaCorriente cuenta2 = new CuentaCorriente(220, cliente2,200.0);

    cuenta2.depositar(40.000); 

    Cheque cheque2 = new Cheque(20000.0, "Banco Galicia", LocalDate.of(2026,10, 4)); 

    cuenta2.depositarCheque(cheque2); 
     cuenta2.extraer(10.000);  


    // CUENTA CONVERTIBILIDAD PARA ClienteEmpresa 

    ClienteEmpresa empresa = new ClienteEmpresa(12, "Magnum Tech", "20714563007"); 
     
    CuentaConvertilidad cuenta1 = new CuentaConvertilidad(327, empresa, 1000.0);

    cuenta1.depositar(100000); 
    cuenta1.extraer(20000.0); 

    cuenta1.depositarDolares(1500.0); 
    cuenta1.extraerDolares(500.0); 

    cuenta1.convertirPesosADolares(25000.0, 2500.0); 
    cuenta1.convertirDolaresAPesos(1000.0, 2000.0); 
    
     

    


    



    




     


        
    }

}
