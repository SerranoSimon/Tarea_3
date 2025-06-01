package Visual;

import Logica.DepositoGenerico;
import Logica.Expendedor;
import Logica.Producto;
import Logica.Productos;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PanelDepositos extends JPanel {
    ArrayList<PanelDepositosIndividuales> panelesDepositosProductos;
    PanelProductoEntregado panelProductoEntregado;
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
    public ArrayList<PanelDepositosIndividuales> getPanelesDepositosProductos(){
        return panelesDepositosProductos;
    }

    public PanelProductoEntregado getPanelProductoEntregado() {
        return panelProductoEntregado;
    }
}
