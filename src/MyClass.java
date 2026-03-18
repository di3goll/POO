/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author di3go
 */
public class MyClass {

    private String atributo1 = "Valor1";

    public MyClass() {
        //atributo1 = "Valor";
        this("Valor");
    }

    public MyClass(String str) {
        this.atributo1 = str;
    }

    public void info() {
        System.out.println("" + atributo1);
    }
}
