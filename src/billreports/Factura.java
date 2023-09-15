/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package billreports;

/**
 *
 * @author jzegarram
 */
public class Factura extends Recibo {
    
    public Factura (String emisor, String fecha, float montoBruto ) {
        super(emisor, fecha, montoBruto);      
    }
    
    public float calcularImpuestos () {
        return getMontoBruto() * 0.19f;
    }
    
}
