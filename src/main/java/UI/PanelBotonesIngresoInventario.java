package UI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JButton;

public class PanelBotonesIngresoInventario extends JPanel implements ActionListener {

    private JButton btnEliminarProducto;
    private JButton btnIngresarProducto;

    public void PanelBotonesIngresoInventario() {
        this.inicializarComponente();
    }

    private void inicializarComponente() {
        FlowLayout distribucion = new FlowLayout();
        this.setLayout(distribucion);

        this.btnIngresarProducto = new JButton("Ingresar Producto");
        this.add(this.btnIngresarProducto);
        this.btnIngresarProducto.addActionListener(this);

        this.btnEliminarProducto = new JButton("Eliminar Producto");
        this.add(this.btnEliminarProducto);
        this.btnEliminarProducto.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (this.btnEliminarProducto == evento.getSource()) {

        } else if (this.btnIngresarProducto == evento.getSource()) {

        }

    }
}
