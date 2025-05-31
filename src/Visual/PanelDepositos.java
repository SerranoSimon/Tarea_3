package Visual;

import Logica.Expendedor;
import Logica.Productos;

import javax.swing.*;
import java.awt.*;

public class PanelDepositos extends JPanel {

    public PanelDepositos(Expendedor exp){
       this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
       this.add(new PanelDepositosIndividuales(exp.getDeposito(Productos.COCACOLA),"1"));
       this.add(new PanelDepositosIndividuales(exp.getDeposito(Productos.SPRITE),"2"));
       this.add(new PanelDepositosIndividuales(exp.getDeposito(Productos.FANTA),"3"));
       this.add(new PanelDepositosIndividuales(exp.getDeposito(Productos.SUPER8),"4"));
       this.add(new PanelDepositosIndividuales(exp.getDeposito(Productos.SNICKERS),"1"));
       this.add(new PanelProductoEntregado());

    }

}
