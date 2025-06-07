package Visual;

import Logica.DepositoGenerico;
import Logica.Expendedor;
import Logica.Producto;
import Logica.Productos;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Clase que gestiona los depositos de productos del expendedor, dependiendo del tipo de producto.
 * Incluye el panel del producto entregado.
 */
public class PanelDepositos extends JPanel {
    ArrayList<PanelDepositosIndividuales> panelesDepositosProductos;
    PanelProductoEntregado panelProductoEntregado;

    /**
     *constructor que inicia el panel con los depositos de los productos.
     * crea y gestiona los paneles para cada tipo de producto en el expendedor.
     * crea un nuevo panel de producto entregado.
     * @param exp expendedor del cual se crean los paneles para los depositos.
     */
    public PanelDepositos(Expendedor exp){
       this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
       panelesDepositosProductos=new ArrayList<>();
       PanelDepositosIndividuales PaneldepCoca=new PanelDepositosIndividuales(exp.getDeposito(Productos.COCACOLA),"1");
       PanelDepositosIndividuales PaneldepSprite=new PanelDepositosIndividuales(exp.getDeposito(Productos.SPRITE),"2");
       PanelDepositosIndividuales PaneldepFanta=new PanelDepositosIndividuales(exp.getDeposito(Productos.FANTA),"3");
       PanelDepositosIndividuales PaneldepSuper8=new PanelDepositosIndividuales(exp.getDeposito(Productos.SUPER8),"4");
       PanelDepositosIndividuales PaneldepSnickers=new PanelDepositosIndividuales(exp.getDeposito(Productos.SNICKERS),"5");
       panelesDepositosProductos.add(PaneldepCoca);
       panelesDepositosProductos.add(PaneldepSprite);
       panelesDepositosProductos.add(PaneldepFanta);
       panelesDepositosProductos.add(PaneldepSuper8);
       panelesDepositosProductos.add(PaneldepSnickers);
       this.panelProductoEntregado=new PanelProductoEntregado();


       this.add(PaneldepCoca);
       this.add(PaneldepSprite);
       this.add(PaneldepFanta);
       this.add(PaneldepSuper8);
       this.add(PaneldepSnickers);
       this.add(panelProductoEntregado);

    }

    /**
     *obtiene un arraylist que contiene los paneles de los depositos de productos de un expendedor.
     *
     * @return lista de los depositos individuales.
     */
    public ArrayList<PanelDepositosIndividuales> getPanelesDepositosProductos(){
        return panelesDepositosProductos;
    }

    /**
     *metodo para obtener el panel donde se muestra el producto entregado.
     * @return panel de producto entregado.
     */
    public PanelProductoEntregado getPanelProductoEntregado() {
        return panelProductoEntregado;
    }
}
