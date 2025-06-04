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

    public PanelExpendedor() {
        this.exp=new Expendedor(5);

        this.setLayout(new BorderLayout());
        Border border = BorderFactory.createLineBorder(Color.BLACK);

        this.setBorder(border);

        this.panelDepositos = new PanelDepositos(exp);
        this.panelCompraExp = new PanelCompraExp(exp);
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
                    exp.comprarProducto(new Moneda1000(),Productos.COCACOLA);
                    panelDepositos.getPanelesDepositosProductos().get(0).actualizar();

                    break;
                case "2":
                    exp.comprarProducto(new Moneda1000(),Productos.SPRITE);
                    panelDepositos.getPanelesDepositosProductos().get(1).actualizar();
                    break;
                case "3":
                    exp.comprarProducto(new Moneda1000(),Productos.FANTA);
                    panelDepositos.getPanelesDepositosProductos().get(2).actualizar();
                    break;
                case "4":
                    exp.comprarProducto(new Moneda1000(),Productos.SUPER8);
                    panelDepositos.getPanelesDepositosProductos().get(3).actualizar();
                    break;
                case "5":
                    exp.comprarProducto(new Moneda1000(),Productos.SNICKERS);
                    panelDepositos.getPanelesDepositosProductos().get(4).actualizar();
                    break;

            }
            panelDepositos.getPanelProductoEntregado().mostrarProducto(exp.getProductoEntregado());
        } catch (NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException ex) {
            throw new RuntimeException(ex);
        }
    }
}
