package Visual;

import Logica.Moneda;
import Logica.Moneda100;
import Logica.Moneda500;
import Logica.Moneda1000;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelComprador extends JPanel {
    private JButton toggleBilletera = new JButton("Abrir Billetera");
    private JPanel panelMonedas = new JPanel();
    private boolean billeteraAbierta = false;
    private int dinero = 0;
    private JLabel contador = new JLabel("Tienes: $0");

    public PanelComprador() {
        this.setLayout(new BorderLayout());
        this.setBackground(Color.WHITE);


        contador.setFont(new Font("Arial", Font.BOLD, 16));
        contador.setHorizontalAlignment(SwingConstants.CENTER);
        contador.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));


        toggleBilletera.setFont(new Font("Arial", Font.BOLD, 14));
        toggleBilletera.setBackground(new Color(240, 240, 240));
        toggleBilletera.setFocusable(false);
        toggleBilletera.addActionListener(e -> toggleBilletera());


        panelMonedas.setLayout(new GridLayout(1, 3, 10, 10));
        panelMonedas.setBackground(Color.WHITE);
        panelMonedas.setBorder(BorderFactory.createEmptyBorder(10, 10, 20, 10));
        panelMonedas.setVisible(false);
        ImageIcon imagen500= new ImageIcon("resources/imagenes/moneda500.png");
        ImageIcon imagen1000= new ImageIcon("resources/imagenes/moneda1000.png");
        ImageIcon imagen100 = new ImageIcon("resources/imagenes/moneda100.png");
        JButton moneda100 = crearBoton("Sacar moneda de $100",100);
        JButton moneda500 = crearBoton("Sacar moneda de $500",500);
        JButton moneda1000 = crearBoton("Sacar billete de $1000",1000);

        moneda100.setIcon(imagen100);
        moneda100.setHorizontalTextPosition(JButton.CENTER);
        moneda100.setVerticalTextPosition(JButton.BOTTOM);
        moneda100.setIconTextGap(15);

        moneda500.setIcon(imagen500);
        moneda500.setHorizontalTextPosition(JButton.CENTER);
        moneda500.setVerticalTextPosition(JButton.BOTTOM);
        moneda500.setIconTextGap(15);

        moneda1000.setIcon(imagen1000);
        moneda1000.setHorizontalTextPosition(JButton.CENTER);
        moneda1000.setVerticalTextPosition(JButton.BOTTOM);
        moneda1000.setIconTextGap(15);

        panelMonedas.add(moneda100);
        panelMonedas.add(moneda500);
        panelMonedas.add(moneda1000);


        add(contador, BorderLayout.NORTH);
        add(panelMonedas, BorderLayout.CENTER);
        add(toggleBilletera, BorderLayout.SOUTH);
    }

    private JButton crearBoton(String txt, int valor) {
        JButton boton = new JButton(txt);
        boton.setFont(new Font("Arial", Font.PLAIN, 12));
        boton.setBackground(Color.WHITE);
        boton.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));

        boton.addActionListener(e -> {
            switch (valor) {
                case 100: new Moneda100(); break;
                case 500: new Moneda500(); break;
                case 1000: new Moneda1000(); break;
            }
            dinero += valor;
            contador.setText("Tienes: $" + dinero);
            JOptionPane.showMessageDialog(this, "Sacaste: $" + valor);
        });

        return boton;
    }

    private void toggleBilletera() {
        billeteraAbierta = !billeteraAbierta;
        panelMonedas.setVisible(billeteraAbierta);
        toggleBilletera.setText(billeteraAbierta ? "Cerrar Billetera" : "Abrir Billetera");

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}