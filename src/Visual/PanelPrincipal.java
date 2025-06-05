package Visual;
import Logica.*;
import java.awt.*;
import javax.swing.*;
public class PanelPrincipal extends JPanel{

    private PanelExpendedor panelExpendedor;
    private PanelComprador panelComprador;

    public PanelPrincipal(){
        super();
        Expendedor exp=new Expendedor(6);
        this.setLayout(new GridLayout(1,2));

        this.setSize(1920,1080);

        panelComprador = new PanelComprador();
        panelComprador.setPreferredSize(new Dimension(300,300));

        panelExpendedor=new PanelExpendedor(panelComprador, exp);
        this.setBackground(Color.WHITE);



        panelExpendedor.setPreferredSize(new Dimension(1000,1400));
        this.add(panelComprador);
        this.add(panelExpendedor);
        this.setVisible(true);



    }

}
