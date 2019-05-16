package parque;

import javax.swing.*;
import java.awt.*;

public class EmpleadosGUI extends JDialog {

    public EmpleadosGUI(JFrame parentFrame) {
        super(parentFrame, "Gestión de empleados", true);
        iniciaGUI();

    }

    private void iniciaGUI() {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(500, 500));
        getContentPane().add(panel);
        setResizable(false);
        pack();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
