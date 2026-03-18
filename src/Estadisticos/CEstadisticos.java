/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estadisticos;

/**
 *
 * @author di3go
 */
public class CEstadisticos {

    int nums[];
    String id;

    CEstadisticos(String id, int ay[]) {
        this.id = id;
        this.nums = new int[ay.length];
        for (int i = 0; i < ay.length; i++) {
            nums[i] = ay[i];
            System.out.println(ay[i]);
        }
    }

    public void imprimir() {
        System.out.println("Arreglo: " + id);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
