package parque;

import javax.swing.*;
import java.awt.*;

public class EstadisticasGUI extends JDialog {

    public EstadisticasGUI(JFrame parentFrame) {
        super(parentFrame, "Gestión de estadísticas", true);
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
