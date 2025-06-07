package Visual;
import Logica.*;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelExpendedor extends JPanel implements ActionListener {
    private Expendedor exp;
    private PanelDepositos panelDepositos;
    private PanelCompraExp panelCompraExp;
    private PanelComprador panelComprador;

    public PanelExpendedor(PanelComprador panelComprador, Expendedor exp) {
        this.panelComprador=panelComprador;
        this.exp=exp;

        this.setLayout(new BorderLayout());
        Border border = BorderFactory.createLineBorder(Color.BLACK);

        this.setBorder(border);

        this.panelDepositos = new PanelDepositos(exp);
        this.panelCompraExp = new PanelCompraExp(exp,panelComprador);
        this.panelCompraExp.setBackground(Color.PINK);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);

        splitPane.setLeftComponent(panelDepositos);
        splitPane.setRightComponent(panelCompraExp);
        splitPane.setResizeWeight(0.6);
        splitPane.setDividerLocation(0.6);


        splitPane.setEnabled(false);
        this.add(splitPane, BorderLayout.CENTER);
        //para que detecte la accion
        panelCompraExp.getRellenar().addActionListener(this);
        for (JButton b : panelCompraExp.getPanelBotonesSeleccion().getBotonesSeleccion()) {
            b.addActionListener(this);}
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Moneda m= PanelComprador.comprador.getMonedaSeleccionada();
        String boton = e.getActionCommand();
        try {
            switch (boton) {
                case "rellenar":
                    if(exp.getDeposito(Productos.COCACOLA).getArr().size()==0){
                        exp.rellenarDeposito(Productos.COCACOLA);
                        panelDepositos.getPanelesDepositosProductos().get(0).rellenar();
                    }
                    if(exp.getDeposito(Productos.SPRITE).getArr().size()==0){
                        exp.rellenarDeposito(Productos.SPRITE);
                        panelDepositos.getPanelesDepositosProductos().get(1).rellenar();
                    }
                    if(exp.getDeposito(Productos.FANTA).getArr().size()==0){
                        exp.rellenarDeposito(Productos.FANTA);
                        panelDepositos.getPanelesDepositosProductos().get(2).rellenar();
                    }
                    if(exp.getDeposito(Productos.SUPER8).getArr().size()==0){
                        exp.rellenarDeposito(Productos.SUPER8);
                        panelDepositos.getPanelesDepositosProductos().get(3).rellenar();
                    }
                    if(exp.getDeposito(Productos.SNICKERS).getArr().size()==0){
                        exp.rellenarDeposito(Productos.SNICKERS);
                        panelDepositos.getPanelesDepositosProductos().get(4).rellenar();
                    }

                    break;
                case "1":
                    PanelComprador.comprador.comprarProducto(m,Productos.COCACOLA,exp);
                    //exp.comprarProducto(m,Productos.COCACOLA);
                    panelDepositos.getPanelesDepositosProductos().get(0).actualizar();
                    panelCompraExp.getPanelDepositoMonedas().actualizar();
                    panelComprador.removerMonedaSelecc();
                    panelCompraExp.getPanelVuelto().mostrarVuelto();
                    panelDepositos.getPanelProductoEntregado().mostrarProducto(exp.getProductoEntregado());

                    break;
                case "2":
                    PanelComprador.comprador.comprarProducto(m,Productos.SPRITE,exp);
                    //exp.comprarProducto(m,Productos.SPRITE);
                    panelDepositos.getPanelesDepositosProductos().get(1).actualizar();
                    panelCompraExp.getPanelDepositoMonedas().actualizar();
                    panelComprador.removerMonedaSelecc();
                    panelCompraExp.getPanelVuelto().mostrarVuelto();
                    panelDepositos.getPanelProductoEntregado().mostrarProducto(exp.getProductoEntregado());
                    break;
                case "3":
                    PanelComprador.comprador.comprarProducto(m,Productos.FANTA,exp);
                    //exp.comprarProducto(m,Productos.FANTA);
                    panelDepositos.getPanelesDepositosProductos().get(2).actualizar();
                    panelCompraExp.getPanelDepositoMonedas().actualizar();
                    panelComprador.removerMonedaSelecc();
                    panelCompraExp.getPanelVuelto().mostrarVuelto();
                    panelDepositos.getPanelProductoEntregado().mostrarProducto(exp.getProductoEntregado());
                    break;
                case "4":
                    PanelComprador.comprador.comprarProducto(m,Productos.SUPER8,exp);
                    //exp.comprarProducto(m,Productos.SUPER8);
                    panelDepositos.getPanelesDepositosProductos().get(3).actualizar();
                    panelCompraExp.getPanelDepositoMonedas().actualizar();
                    panelComprador.removerMonedaSelecc();
                    panelCompraExp.getPanelVuelto().mostrarVuelto();
                    panelDepositos.getPanelProductoEntregado().mostrarProducto(exp.getProductoEntregado());
                    break;

                case "5":
                    PanelComprador.comprador.comprarProducto(m,Productos.SNICKERS,exp);
                    //exp.comprarProducto(m,Productos.SNICKERS);
                    panelDepositos.getPanelesDepositosProductos().get(4).actualizar();
                    panelCompraExp.getPanelDepositoMonedas().actualizar();
                    panelComprador.removerMonedaSelecc();
                    panelCompraExp.getPanelVuelto().mostrarVuelto();
                    panelDepositos.getPanelProductoEntregado().mostrarProducto(exp.getProductoEntregado());
                    break;

            }

        } catch (NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException ex) {
            System.out.println("Error: "+ ex.getMessage());
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
