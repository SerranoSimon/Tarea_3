package Visual;
import Logica.*;
import java.awt.*;
import javax.swing.*;
public class PanelPrincipal extends JPanel{
    private PanelExpendedor panelExpendedor;
    private PanelComprador panelComprador;

    public PanelPrincipal(){
        super();
        panelExpendedor=new PanelExpendedor();
        this.setLayout(new GridBagLayout());
        this.setBackground(Color.WHITE);
        panelExpendedor.setPreferredSize(new Dimension(400,600));
        this.add(panelExpendedor);
        this.setVisible(true);
        panelComprador = new PanelComprador();
        panelComprador.setPreferredSize(new Dimension(300,300));
        this.add(panelComprador);

    }

}
