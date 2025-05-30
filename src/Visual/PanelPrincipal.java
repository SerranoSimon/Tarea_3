package Visual;
import Logica.*;
import java.awt.*;
import javax.swing.*;
public class PanelPrincipal extends JPanel{
    private PanelExpendedor panelExpendedor;

    public PanelPrincipal(){
        super();
        this.setLayout(null);
        this.setSize(1920,1080);
        panelExpendedor=new PanelExpendedor();
        this.setBackground(Color.WHITE);
        this.add(panelExpendedor);
        this.setVisible(true);


    }

}
