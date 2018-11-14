package UI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelPedido extends JPanel implements ActionListener {

    private JButton btnGenerarPedido;

    public PanelPedido() {
        this.incializarComponentes();
    }

    private void incializarComponentes() {
        FlowLayout distribucion = new FlowLayout();
        this.setLayout(distribucion);
        
        this.btnGenerarPedido = new JButton("Generar Pedido");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
