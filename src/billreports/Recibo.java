/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package billreports;

/**
 *
 * @author jzegarram
 */
public class Recibo implements IRecibo {
    private String emisor;
    private String fecha;
    private float montoBruto;
    
    public Recibo(String emisor, String fecha,  float montoBruto ){
        this.emisor = emisor;
        this.montoBruto = montoBruto;
        this.fecha = fecha;
        
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getMontoBruto() {
        return montoBruto;
    }

    public void setMontoBruto(float montoBruto) {
        this.montoBruto = montoBruto;
    }

    @Override
    public float calcularImpuesto() {
        return 0;
    }
    
    
    @Override
    public float calcularMontoNeto(){
        return this.montoBruto + this.calcularImpuesto();
    }
    
    
}
