/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrintF;

import java.util.stream.IntStream;

/**
 *
 * @author di3go
 */
public class Test {

    public static void main(String[] args) {
        String str = "Message 1";

        int len = str.length();

        System.out.printf("la cadena %s tiene %d caracteres\n", str, len);
        
        IntStream intStream = str.chars();
        
        System.out.println(""+ intStream.count());
        
        String name = "Diego Adair Labrada Martinez";
        String[] strArray = name.split("");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println("" + strArray[i]);
        }
        
        StringBuilder strBuilder = new StringBuilder("Diego Adair Labrada Martinez");
        System.out.println("" +  strBuilder.reverse());
        
        System.out.println("1er ciclo");
        for (int i = 0; i < 5; i++) {
            System.out.println("i =" + ++i);
        }
    }
}
