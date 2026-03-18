/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mar;
/**
 *
 * @author di3go
 */
public class COmparacion {

    public static void main(String[] args) {
        String str = "Hello"; //creating using literal
        String str2 = new String("Hello"); //using new keyword

        if (str.equals(str2)) {
            System.out.println("Strings str and str2 are equal");
        } else {
            System.out.println("Strings str and str2 are NOT equal");
        }
    }
}
