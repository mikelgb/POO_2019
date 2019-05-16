package parque;

import descuentos.Descuento;
import entradas.Entrada;
import personas.Persona;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class parque extends JFrame {

    private ArrayList<Entrada> entradas = new ArrayList<Entrada>();
    private ArrayList<Persona> personas = new ArrayList<Persona>();

    public parque() {
        super("Parque de atracciones");

        personasDePrueba(10);
        entradasDePrueba(10);

        iniciaMenuGUI();
    }

    private void iniciaMenuGUI() {
        Container c = getContentPane();
        c.setLayout(new BorderLayout(0, 0));
        JPanel menuGUI = new JPanel(new GridLayout(4, 1));
        iniciaBotones(menuGUI);
        setPreferredSize(new Dimension(250, 500));
        c.add(menuGUI, BorderLayout.CENTER);
        setResizable(false);
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void iniciaBotones(JPanel menuGUI) {
        // Botón para abrir gestión de entradas
        JButton btnEntradas = new JButton("Gestión de entradas");
        btnEntradas.addActionListener(e -> new EntradasGUI(this, entradas, personas));
        menuGUI.add(btnEntradas);
        // Botón para abrir gestión de atracciones
        JButton btnAtracciones = new JButton("Gestión de atracciones");
        btnAtracciones.addActionListener(e -> new AtraccionesGUI(this, entradas, personas));
        menuGUI.add(btnAtracciones);
        // Botón para abrir gestión de empleados
        JButton btnGestEmpleados = new JButton("Gestión de empleados");
        btnGestEmpleados.addActionListener(e -> new EmpleadosGUI(this));
        menuGUI.add(btnGestEmpleados);
        // Botón para abrir gestión de estadísticas
        JButton btnEstadisticas = new JButton("Estadísticas");
        btnEstadisticas.addActionListener(e -> new EstadisticasGUI(this));
        menuGUI.add(btnEstadisticas);
    }

    private void personasDePrueba(int num) {
        for (int i = 0; i < num; i++) {
            int edad = aleatorioEnRango(1, 85);
            float altura = 1f + ((float) aleatorioEnRango(1, 99) / 100);
            Persona p = new Persona("Persona " + i, edad, altura);
            personas.add(p);
        }
    }

    private void entradasDePrueba(int num) {
        for (int i = 0; i < num; i++) {
            Entrada e = new Entrada(new Date(), true, new Descuento[]{}) {
                @Override
                public boolean ventaValida(Persona p) {
                    return false;
                }

                @Override
                public void calcPrecio() {

                }
            };
            entradas.add(e);
        }
    }

    private int aleatorioEnRango(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max debe ser mayor que min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }


    public static void main(String[] args) {
        new parque();
    }
}
