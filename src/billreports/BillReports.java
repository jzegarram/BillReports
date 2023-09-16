/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package billreports;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jzegarram
 */
public class BillReports {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Date today = new Date();

        Empresa osbornCorp = new Empresa("Osborn Corp");

        while (true) {
            System.out.println("===== Sistema de Gestión de Osborn Corp =====");
            System.out.println("1. Ver recibos");
            System.out.println("2. Añadir Recibo");
            System.out.println("3. Calcular total bruto");
            System.out.println("4. Calcular total impuesto");
            System.out.println("5. Calcular total neto");
            System.out.println("0. Salir");
            System.out.print("Ingrese su elección: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    osbornCorp.listarRecibos();
                    break;

                case 2:
                    System.out.println("Tipo de recibo:");
                    System.out.println("1. Factura");
                    System.out.println("2. Boleta");
                    System.out.println("3. Honorario");
                    System.out.println("0. Salir");
                    System.out.println("Ingrese tipo de recibo:");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    if (tipo == 0) break;

                    while (tipo < 0 || tipo > 3) {
                        System.out.println("Error: Tipo de recibo inválido. Por favor ingrese un valor entre 0 y 3.");
                        tipo = scanner.nextInt();
                        scanner.nextLine();
                    }

                    System.out.print("Ingrese el nombre del cliente: ");
                    String clienteName = scanner.nextLine();

                    while (clienteName.trim().isEmpty()) {
                        System.out.println("Error: El nombre del cliente no puede estar vacío. Por favor, ingrese nuevamente.");
                        clienteName = scanner.nextLine();
                    }

                    System.out.print("Ingrese el monto: ");
                    double monto = scanner.nextDouble();

                    while (monto <= 0) {
                        System.out.println("Error: El monto debe ser un valor positivo. Por favor, ingrese nuevamente.");
                        monto = scanner.nextDouble();
                    }

                    osbornCorp.agregarRecibo(today, monto, clienteName, tipo);
                    System.out.println("Recibo añadido con éxito!");


                case 3:
                    System.out.println("Total bruto: " + osbornCorp.calcularTotalBruto());
                    break;

                case 4:
                    System.out.println("Total impuesto: " + osbornCorp.calcularTotalImpuesto());
                    break;

                case 5:
                    System.out.println("Total neto: " + osbornCorp.calcularTotalNeto());
                    break;

                case 0:
                    System.out.println("Saliendo... ¡Gracias!");
                    return;

                default:
                    System.out.println("¡Elección inválida! Seleccione una opción válida.");
            }
        }
    }
    
}
