package parque;

import descuentos.Descuento;
import entradas.Entrada;
import personas.Persona;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;

public class EntradasGUI extends JDialog {

    private ArrayList<Entrada> entradas;
    private ArrayList<Persona> personas;

    public EntradasGUI(JFrame parentFrame, ArrayList<Entrada> entradas, ArrayList<Persona> personas) {
        super(parentFrame, "Gestión de entradas", true);
        this.entradas = entradas;
        this.personas = personas;
        iniciaGUI();

        this.personas.add(new Persona("Nueva", 0, 0));

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
