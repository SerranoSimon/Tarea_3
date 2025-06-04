package Visual;

import Logica.DepositoGenerico;
import Logica.*;
import Logica.Producto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelCompraExp extends JPanel  {
    private PanelBotonesSeleccion panelBotonesSeleccion;
    private PanelVuelto panelVuelto;
    private JButton rellenar;
    private PanelDepositoMonedas DepositoMonedas;
    public PanelCompraExp(Expendedor exp) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        //Titulo
        JLabel titulo = new JLabel("EXPENDEDOR");
        titulo.setHorizontalAlignment(JLabel.CENTER);
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        titulo.setPreferredSize(new Dimension(130, titulo.getPreferredSize().height));
        //Boton rellena depositos
        this.rellenar= new JButton("Rellenar depósitos vacíos");
        rellenar.setActionCommand("rellenar");
        rellenar.setAlignmentX(Component.CENTER_ALIGNMENT);
        rellenar.setPreferredSize(new Dimension(130, 30));


        //Texto seleccion
        JLabel seleccionText = new JLabel("Seleccione su producto:");
        seleccionText.setHorizontalAlignment(JLabel.CENTER);
        seleccionText.setAlignmentX(Component.CENTER_ALIGNMENT);
        seleccionText.setPreferredSize(new Dimension(130, seleccionText.getPreferredSize().height));
        //Texto sobre precios usando HTML
        String texto="<html> 1.Cococola $800<br>2.Sprite $800<br>3.Fanta $700<br>4.Super8 $300<br>5.Snickers $600";
        JLabel textoPrecios=new JLabel(texto);
        textoPrecios.setHorizontalAlignment(JLabel.CENTER);
        textoPrecios.setAlignmentX(Component.CENTER_ALIGNMENT);
        textoPrecios.setPreferredSize(new Dimension(130, seleccionText.getPreferredSize().height));

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

        //Deposito de monedas Texto
        JLabel depMonText = new JLabel("Deposito de monedas");
        depMonText.setHorizontalAlignment(JLabel.CENTER);
       depMonText.setAlignmentX(Component.CENTER_ALIGNMENT);
       depMonText.setPreferredSize(new Dimension(130, vueltoTexto.getPreferredSize().height));

        //Deposito de Monedas
        this.DepositoMonedas=new PanelDepositoMonedas(exp);
        DepositoMonedas.setAlignmentX(Component.CENTER_ALIGNMENT);
        DepositoMonedas.setMaximumSize(new Dimension(120,30));




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

    }

    public JButton getRellenar(){
        return rellenar;
    }
    public PanelBotonesSeleccion getPanelBotonesSeleccion(){
        return panelBotonesSeleccion;
    }
    public PanelDepositoMonedas getPanelDepositoMonedas(){
        return DepositoMonedas;
    }



}
