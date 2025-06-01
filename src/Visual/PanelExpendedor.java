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
                    exp.rellenarDepositos();
                    for(PanelDepositosIndividuales p: panelDepositos.getPanelesDepositosProductos()){
                        p.actualizar();
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
