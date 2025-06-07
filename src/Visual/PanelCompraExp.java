package Visual;

import Logica.DepositoGenerico;
import Logica.*;
import Logica.Producto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * clase que representa visualmente la interfaz de compra del expendedor.
 * contiene funcionalidades como seleccionar productos, rellenar depositos y gestion de vuelto.
 */
public class PanelCompraExp extends JPanel  {
    private PanelBotonesSeleccion panelBotonesSeleccion;
    private PanelVuelto panelVuelto;
    private JButton rellenar;
    private PanelDepositoMonedas DepositoMonedas;

    /**
     * constructor que incia el panel de compra del expendedor.
     * @param exp expendedor logico.
     * @param panelComprador panel del comprador asociado al expendedor.
     */
    public PanelCompraExp(Expendedor exp, PanelComprador panelComprador) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        //Titulo
        JLabel titulo = new JLabel("EXPENDEDOR");
        titulo.setHorizontalAlignment(JLabel.CENTER);
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);

        //Boton rellena depositos
        this.rellenar= new JButton("Rellenar depósitos vacíos");
        rellenar.setActionCommand("rellenar");
        rellenar.setAlignmentX(Component.CENTER_ALIGNMENT);



        //Texto seleccion
        JLabel seleccionText = new JLabel("Seleccione su producto:");
        seleccionText.setHorizontalAlignment(JLabel.CENTER);
        seleccionText.setAlignmentX(Component.CENTER_ALIGNMENT);

        //Texto sobre precios usando HTML
        String texto="<html> 1.Cococola $800<br>2.Sprite $800<br>3.Fanta $700<br>4.Super8 $300<br>5.Snickers $600";
        JLabel textoPrecios=new JLabel(texto);
        textoPrecios.setHorizontalAlignment(JLabel.CENTER);
        textoPrecios.setAlignmentX(Component.CENTER_ALIGNMENT);


        //Botones seleccion
        this.panelBotonesSeleccion=new PanelBotonesSeleccion();
        panelBotonesSeleccion.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelBotonesSeleccion.setMaximumSize(new Dimension(120, 100));

        //Vuelto Texto
        JLabel vueltoTexto = new JLabel("Vuelto");
        vueltoTexto.setHorizontalAlignment(JLabel.CENTER);
        vueltoTexto.setAlignmentX(Component.CENTER_ALIGNMENT);

        //Vuelto panel
        this.panelVuelto=new PanelVuelto(exp, panelComprador);
        panelVuelto.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelVuelto.setMaximumSize(new Dimension(100,70));

        //Deposito de monedas Texto
        JLabel depMonText = new JLabel("Deposito de monedas");
        depMonText.setHorizontalAlignment(JLabel.CENTER);
       depMonText.setAlignmentX(Component.CENTER_ALIGNMENT);


        //Deposito de Monedas
        this.DepositoMonedas=new PanelDepositoMonedas(exp);
        DepositoMonedas.setAlignmentX(Component.CENTER_ALIGNMENT);
        DepositoMonedas.setMaximumSize(new Dimension(120,30));
        //Recoger vuelto Texto
        JLabel RecogeVueltoText = new JLabel("Click en el deposito para recoger vuelto");
        RecogeVueltoText.setHorizontalAlignment(JLabel.CENTER);
       RecogeVueltoText.setAlignmentX(Component.CENTER_ALIGNMENT);



        this.add(Box.createVerticalStrut(20));
        this.add(titulo);
        this.add(Box.createVerticalStrut(20));
        this.add(depMonText);
        this.add(Box.createVerticalStrut(20));
        this.add(DepositoMonedas);
        this.add(Box.createVerticalStrut(50));
        this.add(rellenar);
        this.add(Box.createVerticalStrut(20));
        this.add(textoPrecios);
        this.add(Box.createVerticalStrut(20));
        this.add(seleccionText);
        this.add(Box.createVerticalStrut(10));
        this.add(panelBotonesSeleccion);
        this.add(Box.createVerticalStrut(20));
        this.add(vueltoTexto);
        this.add(Box.createVerticalStrut(10));
        this.add(panelVuelto);
        this.add(RecogeVueltoText);


    }

    /**
     * obtiene el boton de rellenar depositos.
     * @return JButton para rellenar depositos.
     */
    public JButton getRellenar(){
        return rellenar;
    }

    /**
     * obtiene el panel con los botones de seleccion de productos.
     * @return botones numericos de seleccion.
     */
    public PanelBotonesSeleccion getPanelBotonesSeleccion(){
        return panelBotonesSeleccion;
    }

    /**
     *obtiene el panel de deposito de monedas.
     * @return monedas disponibles en el panel.
     */
    public PanelDepositoMonedas getPanelDepositoMonedas(){
        return DepositoMonedas;
    }

    /**
     * obtiene el panel de vuelto asociado al expendedor.
     * @return vuelto en el panel.
     */
    public PanelVuelto getPanelVuelto() {
        return panelVuelto;
    }
}
