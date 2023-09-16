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
    private int index ;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.recibos = new ArrayList<>();
        this.index = 0;
    }
    
    public void agregarRecibo(Date fecha, double monto, String clienteName, int tipo) {        
        switch (tipo) {
            case 1:
                recibos.add(new Factura(nombre, fecha, monto, clienteName));
                Recibo factura = recibos.get(index);
                ((Factura) factura).calcularImpuesto(0.19);
                factura.calcularTotalNeto();
                System.out.println(factura.toString());
                break;

            case 2:
                recibos.add(new Boleta(nombre, fecha, monto, clienteName));
                Recibo boleta = recibos.get(index);
                boleta.calcularTotalNeto();
                System.out.println(boleta.toString());
                break;
            case 3:
                recibos.add(new ReciboHonorarios(nombre, fecha, monto, clienteName));
                Recibo rrhh = recibos.get(index);
                ((ReciboHonorarios) rrhh).calcularImpuesto(0.1);
                rrhh.calcularTotalNeto();
                System.out.println(rrhh.toString());
                break;
        }

        recibos.get(index).calcularTotalNeto();
        index++;
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
            System.out.println("No cuenta con recibos aún");
        } else {
            System.out.println("Listado de recibos:");
            for (int i = 0; i < recibos.size(); i++) {
                Recibo recibo = recibos.get(i);
                System.out.println(recibo.toString());
            }
        }
    }
}







    

