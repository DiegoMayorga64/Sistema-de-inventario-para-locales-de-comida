package UI;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class PanelBotonesInicio extends JPanel implements ActionListener {

    private JButton btnAccesoInventario;
    private JButton btnAccesoPedido;
    private JButton btnSalir;

    public PanelBotonesInicio() {
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {
        FlowLayout distribucion = new FlowLayout();
        this.setLayout(distribucion);

        this.btnAccesoInventario = new JButton("Ir a Inventario");
        this.add(this.btnAccesoInventario);
        this.btnAccesoInventario.addActionListener(this);

        this.btnAccesoPedido = new JButton("Ir a Pedidos");
        this.add(this.btnAccesoPedido);
        this.btnAccesoPedido.addActionListener(this);

        this.btnSalir = new JButton("Salir");
        this.add(this.btnSalir);
        this.btnSalir.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.btnAccesoInventario == e.getSource()) {
            VentanaInventario v1 = new VentanaInventario();
        } else if (this.btnAccesoPedido == e.getSource()) {
            VentanaPedido v1 = new VentanaPedido();
        } else if (this.btnSalir == e.getSource()) {
            System.exit(0);
        }
    }
}
