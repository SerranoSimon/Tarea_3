package Visual;

import Logica.Expendedor;

import javax.swing.*;
import java.awt.*;

public class PanelDepositos extends JPanel {

    public PanelDepositos(){
       this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
       this.add(new PanelDepositosIndividuales("1"));
       this.add(new PanelDepositosIndividuales("2"));
       this.add(new PanelDepositosIndividuales("3"));
        this.add(new PanelDepositosIndividuales("4"));
        this.add(new PanelDepositosIndividuales("5"));
       this.add(new PanelProductoEntregado());

    }

}
