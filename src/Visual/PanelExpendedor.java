package Visual;
import Logica.*;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PanelExpendedor extends JPanel {
    private JPanel panelDepositos;
    private JPanel panelCompraExp;

    public PanelExpendedor() {
        this.setLayout(new BorderLayout());
        Border border = BorderFactory.createLineBorder(Color.BLACK);

        this.setBounds(1920 / 2 - 600, 50, 600, 660);
        this.setBorder(border);

        this.panelDepositos = new PanelDepositos();
        this.panelCompraExp = new PanelCompraExp();

        this.panelCompraExp.setBackground(Color.PINK);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);

        splitPane.setLeftComponent(panelDepositos);
        splitPane.setRightComponent(panelCompraExp);
        splitPane.setResizeWeight(0.6);
        splitPane.setDividerLocation(0.6);


        splitPane.setEnabled(false);


        this.add(splitPane, BorderLayout.CENTER);

    }
}
