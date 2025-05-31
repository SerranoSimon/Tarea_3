package Visual;

import javax.swing.*;
import java.awt.*;

public class PanelCompraExp extends JPanel {
    private PanelBotonesSeleccion panelBotonesSeleccion;
    private PanelVuelto panelVuelto;
    public PanelCompraExp() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        //Titulo
        JLabel titulo = new JLabel("EXPENDEDOR");
        titulo.setHorizontalAlignment(JLabel.CENTER);
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        titulo.setPreferredSize(new Dimension(130, titulo.getPreferredSize().height));
        //Boton rellena depositos
        JButton rellenar = new JButton("Rellenar depósitos vacíos");
        rellenar.setAlignmentX(Component.CENTER_ALIGNMENT);
        rellenar.setPreferredSize(new Dimension(130, 30));

        //Texto seleccion
        JLabel seleccionText = new JLabel("Seleccione su producto:");
        seleccionText.setHorizontalAlignment(JLabel.CENTER);
        seleccionText.setAlignmentX(Component.CENTER_ALIGNMENT);
        seleccionText.setPreferredSize(new Dimension(130, seleccionText.getPreferredSize().height));
        //Botones seleccion
        this.panelBotonesSeleccion=new PanelBotonesSeleccion();
        panelBotonesSeleccion.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelBotonesSeleccion.setPreferredSize(new Dimension(120, 100));
        panelBotonesSeleccion.setMaximumSize(new Dimension(120, 100));
        //Vuelto Texto
        JLabel vueltoTexto = new JLabel("Vuelto");
        vueltoTexto.setHorizontalAlignment(JLabel.CENTER);
        vueltoTexto.setAlignmentX(Component.CENTER_ALIGNMENT);
        vueltoTexto.setPreferredSize(new Dimension(130, vueltoTexto.getPreferredSize().height));
        //Vuelto panel
        this.panelVuelto=new PanelVuelto();
        panelVuelto.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelVuelto.setMaximumSize(new Dimension(100,70));


        this.add(Box.createVerticalStrut(20));
        this.add(titulo);
        this.add(Box.createVerticalStrut(50));
        this.add(rellenar);
        this.add(Box.createVerticalStrut(20));
        this.add(seleccionText);
        this.add(Box.createVerticalStrut(10));
        this.add(panelBotonesSeleccion);
        this.add(Box.createVerticalStrut(20));
        this.add(vueltoTexto);
        this.add(Box.createVerticalStrut(10));
        this.add(panelVuelto);

    }
}
