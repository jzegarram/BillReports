/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package billreports;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author jzegarram
 */
public class Empresa {
    private String nombre;
    private List<Recibo> recibos;
    private int nRecibos ;

    public Empresa(String _nombre) {
        this.nombre = _nombre;
        this.recibos = new ArrayList<>();
        this.nRecibos= 0;
    }
    
    public void agregarRecibo(Date fecha, double monto, String clienteName, int tipo) {        
        switch (tipo) {
            case 1:
                Recibo factura=new Factura(nombre, fecha, monto, clienteName) ;
                recibos.add(factura);
                System.out.println(factura.toString());
                break;

            case 2:
                Recibo boleta = new Boleta(nombre, fecha, monto, clienteName);
                recibos.add(boleta);
                System.out.println(boleta.toString());
                break;
            case 3:
                Recibo rrhh =new ReciboHonorarios(nombre, fecha, monto, clienteName);
                recibos.add(rrhh);
                System.out.println(rrhh.toString());
                break;
        }
        
        nRecibos++;
    }

    public double calcularTotalBruto() {
        double suma = 0;
        for (Recibo recibo : recibos) {
            suma += recibo.getMonto();
        }
        return suma;
    }
    
    public double calcularTotalImpuesto() {
        double suma = 0;
        for (Recibo recibo : recibos) {
            if (recibo instanceof Factura) {
                suma += ((Factura) recibo).getImpuesto();
            } 
             if (recibo instanceof ReciboHonorarios) {
                suma += ((ReciboHonorarios) recibo).getImpuesto();
            } 
        }
        return suma;
    }

    public double calcularTotalNeto() {
        double suma = 0;
        for (Recibo recibo : recibos) {
            suma += recibo.getNeto();
        }
        return suma;
    }
    
    public void listarRecibos() {
    
        if(recibos.isEmpty()) {
            System.out.println("No cuenta con recibos aun");
        } else {
            System.out.println("Listado de recibos:");
            for (int i = 0; i < recibos.size(); i++) {
                Recibo recibo = recibos.get(i);
                System.out.println(recibo.toString());
            }
        }
    }
}







    

