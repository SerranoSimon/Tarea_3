package Visual;
import Logica.*;
import java.awt.*;
import javax.swing.*;
public class PanelPrincipal extends JPanel{
    private PanelExpendedor panelExpendedor;

    public PanelPrincipal(){
        super();
        panelExpendedor=new PanelExpendedor();
        this.setLayout(new BorderLayout());

        this.setSize(400,300);
        this.setVisible(true);
    }
}
