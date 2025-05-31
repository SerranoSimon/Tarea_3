package Visual;
import Logica.*;
import java.awt.*;
import javax.swing.*;
public class PanelPrincipal extends JPanel{

    private PanelExpendedor panelExpendedor;
    private PanelComprador panelComprador;

    public PanelPrincipal(){
        super();
        this.setLayout(new GridLayout(1,2));

        this.setSize(1920,1080);
        panelExpendedor=new PanelExpendedor();
        this.setBackground(Color.WHITE);

        panelComprador = new PanelComprador();
        panelComprador.setPreferredSize(new Dimension(300,300));



        panelExpendedor.setPreferredSize(new Dimension(1000,1400));
        this.add(panelComprador);
        this.add(panelExpendedor);
        this.setVisible(true);



    }

}
