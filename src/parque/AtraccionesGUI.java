package parque;

import entradas.Entrada;
import personas.Persona;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AtraccionesGUI extends JDialog {

    private ArrayList<Entrada> entradas;
    private ArrayList<Persona> personas;

    public AtraccionesGUI(JFrame parentFrame, ArrayList<Entrada> entradas,  ArrayList<Persona> personas) {
        super(parentFrame, "Gestión de atracciones", true);
        this.entradas = entradas;
        this.personas = personas;
        iniciaGUI();


        for (Persona p : this.personas) {
            System.out.println(p.getNombre());
        }


        setResizable(false);
        pack();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void iniciaGUI() {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(500, 500));
        getContentPane().add(panel);
    }
}
