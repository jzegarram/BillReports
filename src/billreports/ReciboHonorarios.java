/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package billreports;

/**
 *
 * @author jzegarram
 */
public class ReciboHonorarios extends Recibo {
        
    public ReciboHonorarios(String emisor, String fecha, float montoBruto) {
        super(emisor, fecha, montoBruto);
    }
    
    public float calcularImpuesto() {
        return this.getMontoBruto() * 0.10f;
    }
}
