/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package billreports;

import java.util.Date;

/**
 *
 * @author jzegarram
 */
public class Boleta extends Recibo {

    public Boleta(String _emisor, Date _fecha, double _monto, String _clienteName) {
        super(_emisor, _fecha, _monto, _clienteName);
    }
          
    @Override
    public void calcularNeto() {
        setNeto(getMonto());
    }
    
    @Override
    public String toString() {
        
        StringBuilder receipt = new StringBuilder();

        receipt.append("**************************\n");
        receipt.append("          BOLETA          \n");
        receipt.append("**************************\n");
        receipt.append("Emisor: ").append(getEmisor()).append("\n");
        receipt.append("--------------------------\n");
        receipt.append("Fecha: ").append(getFecha()).append("\n");
        receipt.append("Cliente: ").append(getClienteName()).append("\n");
        receipt.append("--------------------------\n");
        receipt.append("Monto: $").append(String.format("%.2f", getMonto())).append("\n");
        receipt.append("Neto: $").append(String.format("%.2f", getNeto())).append("\n");
        receipt.append("**************************\n");

        return receipt.toString();
    }
    
}
