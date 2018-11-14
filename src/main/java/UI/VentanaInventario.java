package UI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;

public class VentanaInventario extends JFrame {

    private PanelBotonesIngresoInventario pnlBtnsIngresoInv;
    private PanelBtnsGenerarInventario pnlBtnsGenerarInv;
    private PanelTablaInventario pnlTablaInv;

    public VentanaInventario() {
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 400);
        this.setLocation(300, 300);
        this.setTitle("Gestion de Inventario");
        this.setVisible(true);
        
        this.pnlBtnsIngresoInv = new PanelBotonesIngresoInventario();
        this.add(this.pnlBtnsIngresoInv, BorderLayout.CENTER);

        this.pnlTablaInv = new PanelTablaInventario();
        this.add(this.pnlTablaInv, BorderLayout.SOUTH);

        this.pnlBtnsGenerarInv = new PanelBtnsGenerarInventario();
        this.add(this.pnlBtnsGenerarInv, BorderLayout.SOUTH);

    }
}
