package Visual;
import Logica.*;
import java.awt.*;
import javax.swing.*;
public class PanelPrincipal extends JPanel{

    private PanelExpendedor panelExpendedor;
    private PanelComprador panelComprador;

    public PanelPrincipal(){
        super();
        this.setLayout(null);
        this.setSize(1920,1080);
        panelExpendedor=new PanelExpendedor();
        this.setBackground(Color.WHITE);
        panelExpendedor.setBounds(1920/2-600/2, 30, 600, 660);
        this.add(panelExpendedor);
        this.setVisible(true);
       // panelComprador = new PanelComprador();
        //panelComprador.setPreferredSize(new Dimension(300,300));
       // this.add(panelComprador);


    }

}
