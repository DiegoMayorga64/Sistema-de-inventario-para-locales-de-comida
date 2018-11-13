package UI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBtnsGenerarInventario extends JPanel implements ActionListener {

    private JButton btnGenerarInventario;
    private JButton btnRetorno;

    public void PanelIngresoInventario() {
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {
        FlowLayout distribucion = new FlowLayout();
        this.setLayout(distribucion);
        
        this.btnGenerarInventario = new JButton("Generar Inventario");
        this.add(this.btnGenerarInventario);
        this.btnGenerarInventario.addActionListener(this);
        
        this.btnRetorno = new JButton("Volver a Inicio");
        this.add(this.btnRetorno);
        this.btnRetorno.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.btnGenerarInventario == e.getSource()){
            
        } else if (this.btnRetorno == e.getSource()){
            
        }

    }
}
