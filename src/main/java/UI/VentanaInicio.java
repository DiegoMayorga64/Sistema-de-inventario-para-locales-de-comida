package UI;

import java.awt.BorderLayout;
import javafx.scene.layout.Border;
import javax.swing.JFrame;

public class VentanaInicio extends JFrame {

    private PanelBotonesInicio pnlBtnsInicio;
    private PanelIncio pnlInicio;

    public VentanaInicio() {
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {

        this.pnlBtnsInicio = new PanelBotonesInicio();
        this.add(this.pnlBtnsInicio, BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 400);
        this.setLocation(300, 300);
        this.setTitle("Mi ventana");
        this.setVisible(true);
    }
}
