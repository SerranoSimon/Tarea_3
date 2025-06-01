package Visual;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PanelBotonesSeleccion extends JPanel {
    private ArrayList<JButton> botonesSeleccion;
    public PanelBotonesSeleccion(){
        this.setLayout(new FlowLayout());
        this.setBackground(Color.GRAY);
        this.botonesSeleccion=new ArrayList<>();
        for(int i=1;i<6;i++){
           JButton botonSelecc= new JButton();
           botonSelecc.setText(String.valueOf(i));
           botonSelecc.setActionCommand(String.valueOf(i));
           botonesSeleccion.add(botonSelecc);
            this.add(botonSelecc);
        }
    }

    public ArrayList<JButton> getBotonesSeleccion() {
        return botonesSeleccion;
    }
}
