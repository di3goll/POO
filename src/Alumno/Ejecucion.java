/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alumno;

/**
 *
 * @author di3go
 */

import javax.swing.*;
import java.awt.*;

public class Ejecucion extends JFrame {
    // Definimos los campos de texto para capturar los datos [cite: 213]
    private JTextField txtNombre, txtSemestre, txtIdMat, txtNomMat, txtCalificacion;
    private JTextArea areaSalida;
    private Alumno alumno;

    public Ejecucion() {
        // Configuración básica de la ventana [cite: 217-219]
        setSize(450, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Componentes de entrada: Para que el usuario escriba los datos [cite: 230-234]
        add(new JLabel("Nombre Alumno:")); txtNombre = new JTextField(20); add(txtNombre);
        add(new JLabel("Semestre:")); txtSemestre = new JTextField(5); add(txtSemestre);
        add(new JLabel("ID Materia:")); txtIdMat = new JTextField(5); add(txtIdMat);
        add(new JLabel("Nombre Materia:")); txtNomMat = new JTextField(15); add(txtNomMat);
        add(new JLabel("Calificación:")); txtCalificacion = new JTextField(5); add(txtCalificacion);

        // Botones para ejecutar acciones [cite: 235-237]
        JButton btnGuardar = new JButton("Guardar Materia");
        JButton btnMostrar = new JButton("Ver Boleta");
        add(btnGuardar); add(btnMostrar);

        // Área de salida: Aquí se imprime la boleta final [cite: 238]
        areaSalida = new JTextArea(15, 35);
        areaSalida.setEditable(false);
        add(new JScrollPane(areaSalida));

        // Evento para GUARDAR
        btnGuardar.addActionListener(e -> {
            try {
                // Si el alumno no existe, lo creamos con los datos de los campos
                if (alumno == null) {
                    // Nota: Pasamos 0 y null porque tu constructor los sobreescribe internamente
                    alumno = new Alumno(txtNombre.getText(), Integer.parseInt(txtSemestre.getText()), 0, null);
                }
                
                // Creamos el objeto materia con los nuevos nombres de métodos
                Materia nuevaMateria = new Materia(
                    Integer.parseInt(txtIdMat.getText()), 
                    txtNomMat.getText(), 
                    Double.parseDouble(txtCalificacion.getText())
                );

                // Intentamos añadir la materia al arreglo estático 
                if (alumno.AñadirMat(nuevaMateria)) {
                    JOptionPane.showMessageDialog(this, "Materia guardada correctamente");
                    limpiarCamposMateria();
                } else {
                    JOptionPane.showMessageDialog(this, "Error: Límite de 6 materias alcanzado [cite: 18]");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: Asegúrate de llenar bien los campos numéricos");
            }
        });

        // Evento para MOSTRAR la boleta
        btnMostrar.addActionListener(e -> {
            if (alumno != null) {
                areaSalida.setText(alumno.Boleta()); // Llamamos a tu método Boleta()
            } else {
                areaSalida.setText("No hay datos registrados aún.");
            }
        });
    }

    private void limpiarCamposMateria() {
        txtIdMat.setText(""); txtNomMat.setText(""); txtCalificacion.setText("");
    }

    public static void main(String[] args) {
        // Lanzamos la interfaz gráfica [cite: 262]
        new Ejecucion().setVisible(true);
    }
}