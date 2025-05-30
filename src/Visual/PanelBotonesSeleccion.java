package Visual;

import javax.swing.*;
import java.awt.*;

public class PanelBotonesSeleccion extends JPanel {
    public PanelBotonesSeleccion(){
        this.setLayout(new GridLayout(3,2));
        for(int i=1;i<6;i++){
           JButton botonSelecc= new JButton();
           botonSelecc.setText(String.valueOf(i));
            this.add(botonSelecc);
        }
    }
}
