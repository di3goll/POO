/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estadisticos;

import java.util.Scanner;

/**
 *
 * @author di3go
 */
public class EstadisticosApp {

    /**
     * @Di3go
     */
    public static void main(String[] args) {
        int n;
        Scanner Cap = new Scanner(System.in);
        System.out.println("Tamaño:");
        n = Cap.nextInt();
        int[] ax = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(" Dato: " + (i + 1) + ": ");
            ax[i] = Cap.nextInt();
        }
        CEstadisticos objeto1 = new CEstadisticos("04", ax);
        objeto1.imprimir();
    }
}
