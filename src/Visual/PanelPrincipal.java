package Visual;
import Logica.*;
import java.awt.*;
import javax.swing.*;
public class PanelPrincipal extends JPanel{
    private PanelExpendedor panelExpendedor;

    public PanelPrincipal(){
        super();
        panelExpendedor=new PanelExpendedor();
        this.setLayout(new GridBagLayout());
        this.setBackground(Color.WHITE);
        panelExpendedor.setPreferredSize(new Dimension(400,600));
        this.add(panelExpendedor);
        this.setVisible(true);

    }

}
