/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerrepaso;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class TallerRepaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double valorCancelar;
        int numeroEmpleados;
        String salida;
        String nombreEmpleado;
        int cedulaEmpleado;
        int horasMatutinas;
        int horasNocturnas;
        String ciudadEmpresa;
        int valorAdicional = 10;
        int horaMatutina = 10;
        int horaNocturna = 15;
        int contador = 0;
        boolean bandera = true;
        double seguroSocial = 18;
        double subTotal;
        String serie;

        do {

            System.out.println("Ingrese su nombre por favor");
            nombreEmpleado = entrada.nextLine();

            System.out.println("Ingrese su número de cédula por favor");
            cedulaEmpleado = entrada.nextInt();

            System.out.println("Ingrese sus horas matutinas trabajadas por favor");
            horasMatutinas = entrada.nextInt();

            System.out.println("Ingrese sus horas nocturnas trabajadas por favor");
            horasNocturnas = entrada.nextInt();

            System.out.println("Ingrese la ciudad de la empresa donde trabaja por favor");
            ciudadEmpresa = entrada.nextLine();

            if (horasNocturnas >= 10) {
                horasMatutinas = horasMatutinas * horaMatutina;
                valorAdicional = (horaNocturna * valorAdicional) / 100;
                horasNocturnas = horasNocturnas * horaNocturna + valorAdicional;
                subTotal = horasMatutinas + horasNocturnas;
                seguroSocial = (subTotal * seguroSocial) / 100;
                valorCancelar = subTotal - seguroSocial;
                serie = String.format("Rol del trabajador de nombre %s y cédula %d."
                        + "\nHoras matutinas trabajadas: %d.\nHoras nocturnas "
                        + "trabajadas: %d.\nSubtotal %.2f\nSeguro Social %.2f\n"
                        + "Total a cancelar %.2f",
                        nombreEmpleado, cedulaEmpleado, horasMatutinas,
                        horasNocturnas, subTotal, seguroSocial, valorCancelar);
                entrada.nextLine();
            } else {
                horasMatutinas = horasMatutinas * horaMatutina;
                horasNocturnas = horasNocturnas * horaNocturna;
                subTotal = horasMatutinas + horasNocturnas;
                seguroSocial = (subTotal * seguroSocial) / 100;
                valorCancelar = subTotal - seguroSocial;
                serie = String.format("Rol del trabajador de nombre %s y cédula %d."
                        + "\nHoras matutinas trabajadas: %d\nHoras nocturnas "
                        + "trabajadas: %d.\nSubtotal %.2f\nSeguro Social %.2f\n"
                        + "Total a cancelar %.2f",
                        nombreEmpleado, cedulaEmpleado, horasMatutinas,
                        horasNocturnas, subTotal, seguroSocial, valorCancelar);
                entrada.nextLine();
            }

        }
